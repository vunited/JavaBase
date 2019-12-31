package Main;

import com.aliyuncs.IAcsClient;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;

/**
 * SaveSingleTaskForCreatingOrderActivate        提交域名注册任务
 * AddCdnDomain     添加加速域名
 */
public class Demo {

    private static String domainName = "videoliveoss.****.club";

    public static void main(String[] args) {

        IAcsClient client = initialization();
        try {
            // 提交域名注册任务
            testSaveSingleTaskForCreatingOrderActivate(client);
            // 添加加速域名
            addCdnDomain(client);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }

    }

    /**
     * SaveSingleTaskForCreatingOrderActivate        提交域名注册任务
     */
    private static void testSaveSingleTaskForCreatingOrderActivate(IAcsClient client) throws ClientException {
        SaveSingleTaskForCreatingOrderActivateRequest request = new SaveSingleTaskForCreatingOrderActivateRequest();
        System.out.println("------------------testSaveSingleTaskForCreatingOrderActivate-------------------");
        // 域名
        request.setDomainName(domainName);
        // 详细地址（英文）
        request.setAddress("hai dian qu");
        // 城市（英文）。
        request.setCity("bei jing");
        // 国家代码，例如CN
        request.setCountry("CN");
        request.setProvince("beijing");
        // 是否使用阿里云DNS，默认为true。当使用非阿里云DNS时，请先确保该DNS是有效DNS，否则可能导致注册失败。
        request.setAliyunDns(true);
        // 电子邮箱
        request.setEmail("112233445566@163.com");
        // 是否开启域名隐私保护服务，默认为true。
        request.setEnableDomainProxy(true);
        // 接口返回错误信息语言。取值：
        // zh：中文；
        // en：英文。
        // 默认为en。
        request.setLang("zh");
        // 域名联系人（英文）
        request.setRegistrantName("ceShiRenYuan");
        // 域名持有者名称（英文）
        request.setRegistrantOrganization("ceShiRenYuan");
        // 域名联系人（中文）
        request.setZhRegistrantName("测试人员");
        // 域名持有者名称（中文）
        request.setZhRegistrantOrganization("测试人员");
        // 电话号码
        request.setTelephone("13888888888");
        // 用户IP
        request.setUserClientIp("46.152.24.5");
        SaveSingleTaskForCreatingOrderActivateResponse response = client.getAcsResponse(request);
        System.out.println(new Gson().toJson(response));
    }

    /**
     * AddCdnDomain     添加加速域名
     */
    private static void addCdnDomain(IAcsClient client) throws ClientException {
        AddCdnDomainRequest request = new AddCdnDomainRequest();
        System.out.println("------------------addCdnDomain-------------------");
        request.setDomainName(domainName);
        request.setCdnType("web");
        request.setSources("[\n" +
                "  {\n" +
                "    \"content\": \"1.1.1.1\",\n" +
                "    \"type\": \"ipaddr\",\n" +
                "    \"priority\": \"20\",\n" +
                "    \"port\": 80,\n" +
                "    \"weight\": \"15\"\n" +
                "  }\n" +
                "]");
        AddCdnDomainResponse response = client.getAcsResponse(request);
        System.out.println(new Gson().toJson(response));
    }

    /**
     * Initialization  初始化公共请求参数
     */
    private static IAcsClient initialization() {
        // 初始化请求参数
        DefaultProfile profile = DefaultProfile.getProfile(
                "<your-region-id>", // 您的可用区ID
                "<your-access-key-id>", // 您的AccessKey ID
                "<your-access-key-secret>"); // 您的AccessKey Secret
        return new DefaultAcsClient(profile);
    }
}