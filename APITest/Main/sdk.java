package Main;
import org.junit.Test;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dataworks_public.model.v20180601.CreateManualDagRequest;
import com.aliyuncs.dataworks_public.model.v20180601.CreateManualDagResponse;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.JsonObject;

public class sdk {

  @Test
  public void createManualDagTest() throws Exception { 
    CreateManualDagRequest request = new CreateManualDagRequest();
    request.setProjectName("hello_sh_sh");//项目名称。
    request.setFlowName("test_flow");//手动业务流程名称。
    request.setBizdate("2019-03-20");//运行的业务时间，注意日期应为当前日期的前一天。
    JsonObject dagPara = new JsonObject();
    dagPara.addProperty("ssss","testsetstsetsetest");//业务流程参数。
    request.setDagPara(dagPara.toString());
    request.setRegionId("cn-shanghai");// 需要在此处更新项目所在Region。
    JsonObject nodePara = new JsonObject();
    nodePara.addProperty("700000246408", "ssss=oooo"); //配置节点参数，如果业务流程配置节点参数不生效。
    System.out.println(nodePara.toString());
    request.setNodePara(nodePara.toString());
    DefaultProfile.addEndpoint(
      "cn-shanghai",  //对应DataWorks工作空间所在的Region ID。
      "cn-shanghai",  //对应DataWorks工作空间所在的Region ID。
      "dataworks-public",//固定值。
      "dataworks.aliyuncs.com");//访问DataWorks地址。
    DefaultProfile profile = DefaultProfile.getProfile("cn-shanghai","LTAI**************","OU9g38cCpT***********"); // 填写实际的RegionID、AccessKeyID和AccessKeySecret。
    IAcsClient client = new DefaultAcsClient(profile);
    request.setProtocol(ProtocolType.HTTP);
    String a = "";
    a.indexOf(ch)
    CreateManualDagResponse response = client.getAcsResponse(request); //调用客户端。
    System.out.println(response.getRequestId());//
    System.out.println(response.getReturnCode());//
    System.out.println(response.getReturnErrorSolution());//
    System.out.println(response.getReturnMessage());//
    System.out.println(response.getReturnValue()); //输出响应。
  }

  public static void main(String[] args) {

  }
}