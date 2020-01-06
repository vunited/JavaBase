
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map;

import com.show.api.util.Base64;
import com.show.api.util.WebUtils;

public class Demo {
	public static void 今日油价(String adfas[]) throws Exception {
		byte b[] = new ShowapiRequest("http://ali-todayoil.showapi.com/todayoil", "appcode").addTextPara("prov", "北京")
				.getAsByte();
		String str = new String(b, "utf-8");
		System.out.println(str);
	}

	public static void ip(String adfas[]) throws Exception {
		byte b[] = new ShowapiRequest("https://ali-ip.showapi.com/ip", "appcode").addTextPara("ip", "223.5.5.5")
				.getAsByte();
		String str = new String(b, "utf-8");
		System.out.println(str);
	}

	public static void 三网手机认证() throws Exception {
		ShowapiRequest req = new ShowapiRequest("https://auditphone.showapi.com/phoneAudit", "appcode");
		byte b[] = req.addTextPara("typeId", "1").addTextPara("page", "1").getAsByte();
		String str = new String(b, "utf-8");
		Map map = req.getRes_headMap();
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Object k = it.next();
			System.out.println(k + "          " + map.get(k));
		}
		System.out.println(str);

	}

	public static void 银行卡归属地() throws Exception {
		ShowapiRequest req = new ShowapiRequest("https://ali-bankcard4.showapi.com/bank4", "appcode");
		byte b[] = req.addTextPara("typeId", "1").addTextPara("page", "1").getAsByte();
		String str = new String(b, "utf-8");
		Map map = req.getRes_headMap();
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Object k = it.next();
			System.out.println(k + "          " + map.get(k));
		}
		System.out.println(str);

	}

	public static void 发送短信() throws Exception {
		ShowapiRequest req = new ShowapiRequest("http://ali-sms.showapi.com/sendSms", "appcode");
		byte b[] = req.addTextPara("content", "1").addTextPara("mobile", "1").addTextPara("tNum", "1").getAsByte();
		String str = new String(b, "utf-8");
		Map map = req.getRes_headMap();
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Object k = it.next();
			System.out.println(k + "          " + map.get(k));
		}
		System.out.println(str);

	}

	public static void main(String adfas[]) throws Exception {
		图片验证();
	}

	public static void 虾米音乐(String adfas[]) throws Exception {
		ShowapiRequest req = new ShowapiRequest("http://ali-music.showapi.com/xiamimusic-top", "appcode");
		byte b[] = req.addTextPara("typeId", "1").addTextPara("page", "1").getAsByte();
		String str = new String(b, "utf-8");
		Map map = req.getRes_headMap();
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Object k = it.next();
			System.out.println(k + "          " + map.get(k));
		}
		System.out.println(str);
	}

	public static void 违章(String adfas[]) throws Exception {
		ShowapiRequest req = new ShowapiRequest("https://ali-shanxi-car.showapi.com/sxwz_info", "appcode")
				.addTextPara("carEngineCode", "BA40335").addTextPara("carNumber", "陕AF426G")
				.addTextPara("carType", "02");
		byte b[] = req.getAsByte();
		String str = new String(b, "utf-8");
		System.out.println(str);
		Map map = req.getRes_headMap();
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Object k = it.next();
			System.out.println(k + "          " + map.get(k));
		}
	}

	public static void 微信查询(String adfas[]) throws Exception {
		ShowapiRequest req = new ShowapiRequest("http://ali-weixin.showapi.com/582-9", "appcode").addTextPara("url",
				" ");

		byte b[] = req.getAsByte();
		String str = new String(b, "utf-8");
		System.out.println(str);
		Map map = req.getRes_headMap();
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Object k = it.next();
			System.out.println(k + "          " + map.get(k));
		}
	}

	public static void ip查询天气(String adfas[]) throws Exception {
		ShowapiRequest req = new ShowapiRequest("https://ali-weather.showapi.com/ip-to-weather", "appcode")
				.addTextPara("ip", "223.5.5.5");
		byte b[] = req.getAsByte();
		String str = new String(b, "utf-8");
		System.out.println(str);
		Map map = req.getRes_headMap();
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Object k = it.next();
			System.out.println(k + "          " + map.get(k));
		}
	}

	public static void 快递(String adfas[]) throws Exception {
		ShowapiRequest req = new ShowapiRequest("http://ali-deliver.showapi.com/showapi_expInfo", "appcode")
				.addTextPara("paraname", "xxxxx").addTextPara("paraname", "xxxxx").addTextPara("paraname", "xxxxx");
		byte b[] = req.postAsByte();
		String str = new String(b, "utf-8");
		System.out.println("aaaaaaaaaaaa");
		System.out.println(str);
		Map map = req.getRes_headMap();
		Iterator it = map.keySet().iterator();
		System.out.println("bbbbbbbbbbb");
		while (it.hasNext()) {
			Object k = it.next();
			System.out.println(k + "          " + map.get(k));
		}
	}

	public static void 图片验证() throws Exception {
		ShowapiRequest req = new ShowapiRequest("http://ali-checkcode2.showapi.com/checkcode", "appcode");
		byte img[] = WebUtils.readByteFromStream(new FileInputStream(new File("c:/g86pm.jpg")));
		String base64string = new String(Base64.encode(img));
		System.out.println(base64string);
		byte b[] = req.addTextPara("typeId", "3000").addTextPara("convert_to_jpg", "0")
				.addTextPara("img_base64", base64string).postAsByte();
		// 打印返回头
		Map map = req.getRes_headMap();
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Object k = it.next();
			System.out.println(k + "          " + map.get(k));
		}
		// 打印返回体
		String res = new String(b, "utf-8");
		System.out.println(res);

		// 下面是使用阿里的fastjson包解析。如果不需要，请使用自己的解析包
//		JSONObject json=JSONObject.parseObject(res);
//		System.out.println(json.getJSONObject("showapi_res_body"));
	}
}
