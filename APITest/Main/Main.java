package Main;
// 版权所有 © 艾科瑞特科技
// 艾科瑞特（iCREDIT）-让企业业绩长青
// 预知更多业绩长青，请与我们联系
// 联系电话：0532-88984128
// 联系邮箱：market@itruth.xin

import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static org.apache.commons.codec.binary.Base64.encodeBase64;

public class Main {

    public static void main(String[] args) {
        //API产品路径
        String host = "http://iface.market.alicloudapi.com";
        String path = "/ai_market/ai_face";
        String method = "POST";
        //阿里云APPCODE
        String appcode = "1e5d7408a49d4cf3a1c2f8df64dd17dd";
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();

        //内容数据类型，如：0，则表示BASE64编码；1，则表示图像文件URL链接        
        //启用BASE64编码方式进行识别
        //内容数据类型是BASE64编码
        String imgFile = "JAVA.png";
        String imgBase64 = "";
        try {
            File file = new File(imgFile);
            byte[] content = new byte[(int) file.length()];
            FileInputStream finputstream = new FileInputStream(file);
            finputstream.read(content);
            finputstream.close();
            imgBase64 = new String(encodeBase64(content));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        System.out.println(imgBase64);
       bodys.put("IMAGE", imgBase64);
       bodys.put("IMAGE_TYPE", "0");
        
        //启用URL方式进行识别
        //内容数据类型是图像文件URL链接
//        bodys.put("IMAGE", "JAVA.png");
//        bodys.put("IMAGE_TYPE", "1");
        
        try {
            /**
            * 重要提示如下:
            * HttpUtils请从
            * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
            * 下载
            *
            * 相应的依赖请参照
            * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
            */
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            System.out.println(EntityUtils.toString(response.getEntity()));
           } catch (Exception e) {
                e.printStackTrace();
            }
    }
}