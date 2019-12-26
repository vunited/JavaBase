package IDCard;
/**
 * <b>基于Jetty的嵌入式Servlet容器</b>
 *
 * @author atom.wu
 * @date 2008-06-06
 * @since 1.0
 */
public class AOSServer {

    private static Logger log = LoggerFactory.getLogger(AOSServer.class);

    /**
     * 监听端口, 缺省为80
     */
    private int port = 80;

    /**
     * 应用上下文, 缺省为/(无上下文)
     */
    private String webContext = "/";

    public AOSServer() {

    }
    /**
     * 构造Server实例
     *
     * @param pWebContext
     * @param pPort
     */
    public AOSServer(String pWebContext, int pPort) {
        setWebContext(pWebContext);
        setPort(pPort);
    }

    public int getPort() {
        return port;
    }

    /**
     * 监听端口, 缺省为80
     *
     * @param port
     */
    public void setPort(int port) {
        this.port = port;
    }

    public String getWebContext() {
        return webContext;
    }

    /**
     * 应用上下文, 缺省为/(无上下文)
     *
     * @param webContext
     */
    public void setWebContext(String webContext) {
        this.webContext = webContext;
    }
    

    /**
     * 启动Jetty容器
     */
    public void start() throws Exception {
        long start = System.currentTimeMillis();
        final String webRoot = System.getProperty("user.dir") + "/WebContent"; //工程路径
        Server server = new Server();
        // 设置在JVM退出时关闭Jetty的钩子。
        server.setStopAtShutdown(true);
        SelectChannelConnector connector = new SelectChannelConnector();
        //disable nio cache to unlock the css and js file when running
        connector.setUseDirectBuffers(false);
        // 解决Windows下重复启动Jetty居然不报告端口冲突的问题.
        connector.setReuseAddress(false);
        connector.setPort(port);
        server.setConnectors(new Connector[]{connector});
        WebAppContext context = new WebAppContext();
        context.setResourceBase("WebContent");
        context.setContextPath(webContext);
        //设置表单提交大小 (缺省值：200000)
        context.setMaxFormContentSize(10000000);
        context.setParentLoaderPriority(true);
        //针对jetty使用jstl的特殊设置，扫描tld文件。指定哪些jar中可能含有tld。
        context.setAttribute("org.eclipse.jetty.server.webapp.ContainerIncludeJarPattern", ".*/.*jsp-api-[^/]*\\.jar$|.*/.*jsp-[^/]*\\.jar$|.*/.*taglibs[^/]*\\.jar$|.*/.*jstl[^/]*\\.jar$");
        server.setHandler(context);
                
        boolean isSuccess = true;
        try {
            server.start();
        } catch (BindException e) {
            isSuccess = false;
        } catch (Exception e) {
            isSuccess = false;
        } finally{
            String msg = "sa-web启动成功";
            String supportMsg = " ";
            if ( !isSuccess) {
                msg = "sa-web启动失败";
                log.error(msg);
                msg = msg + supportMsg;
                System.out.println(msg);
                System.exit(0);
            }else {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Clipboard clipboard = toolkit.getSystemClipboard();
                webContext = webContext.equals("/") ? "" : webContext;
                String webUrl = "http://localhost";
                if (port == 80) {
                    webUrl = webUrl + webContext;
                }else {
                    webUrl = webUrl + ":" + port + webContext;
                }
                StringSelection stringSel = new StringSelection(webUrl);
                clipboard.setContents(stringSel, null);
                long alltime = System.currentTimeMillis() - start;
                msg = msg + "[" + alltime + "毫秒]" + " >> " + webUrl + supportMsg;
                System.out.println(msg);
                server.join(); //线程阻塞
            }
        }
    }