package com.spider;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class News {
	static String url = "http://bbs.tianya.cn/list-free-1.shtml";
	static String url2 = "http://china.cnr.cn/yaowen/";
	
	public static  void main(String[] args) throws Exception {
		
		V2_1();
	}
	
	public static void V2_1() throws Exception
	{
		// TODO Auto-generated method stub
				Document document = Jsoup.connect(url).get();
				
				Document document1 = Jsoup.connect(url2).timeout(10000).get();
				Elements content = document1.getElementsByClass("text");
				
				Elements es = document.getElementsByClass("bg");
				Elements es2 = content.select("a[href]");
				//ArrayList<Elements> al = new ArrayList<Elements>();
				//al.add(0, content);
				
				//Elements links = es.select("a[href]");
//				for (Element link : links) {
//					String title = link.text();
//					System.out.println(title);
//					String linkHref = link.attr("href");
//					System.out.println(linkHref);
//				}
//				
				for (Element element : es2) {
					Element alink = element.getElementsByTag("a").first();
					if (alink != null && alink.text().equalsIgnoreCase("节目在线点播")==false) {
						System.out.println(alink.attr("href"));
						System.out.println(alink.text());
					}
				}
				
	}

}
