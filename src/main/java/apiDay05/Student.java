package com.test.apiDay05;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {
	private String name;
	private Integer age;
	private Map<String, Integer> scoreSheet;
	
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//添加一科成绩
	public void addScore(String subject,int score) {
		if(scoreSheet==null) {
			scoreSheet=new HashMap<String, Integer>();
		}
		scoreSheet.put(subject, score);
	}

	@Override
	public String toString() {
		Set<Entry<String,Integer>> set=scoreSheet.entrySet();
		StringBuffer strB=new StringBuffer();
		for(Entry<String,Integer> entry:set) {
			strB.append(name);
			strB.append(",");
			strB.append(age);
			strB.append(",");
			strB.append(entry.getKey());
			strB.append(",");
			strB.append(entry.getValue());
			strB.append("\r\n"); //  \r\n ===Enter    \t 占位转义字符
		}
		return strB.toString();
	}	
}
