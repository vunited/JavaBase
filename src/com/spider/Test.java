package com.spider;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;
import com.sun.xml.internal.txw2.Document;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String url = "http://www.lietu.com/";
		org.jsoup.nodes.Document doc = Jsoup.connect(url).get();
		Elements links = doc.select("a[href]");
		
		for (Element element : links) {
			System.out.println(""+element.attr("href")+"\n"+element.text());
			
		}
		
		
		}

}
