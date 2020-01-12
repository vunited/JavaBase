package com.test.oopDay02;

public class OppDay0202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		!!!String 字符串
//		String str1 = "abc"; //字面量赋值 推荐使用
//		String str2 = new String("abc"); //完整的实例化String对象
//		
////		String的值 是不可更改的。 删掉原来的 创建新的
//		str1+="xxx";

		String str1 = " ";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str3 == str2);
		System.out.println(str3.equals(str4));

//	    1 str1.length()
//	    2 str1.charAt(index)
//	    3 str1.toLowerCase()  str1.toUpperCase()
//	    4 str1.substring(beginIndex)  str1.substring(beginIndex, endIndex)
//	    5 str1.trim()
//	    6 str1.startsWith(prefix)
//	    7 str1.indexOf(ch)
//	    8 str1.equals(anObject) str1.equalsIgnoreCase(anotherString)
//	    9 str1.compareTo(anotherString)
//	    10 str1.split(regex)  str1.split(regex, limit)
//	    11 str1.replace(oldChar, newChar)
//	    12 str1.valueOf(b)
//	    13 str1.contains(s)
//	    14 str1.concat(str)
		System.out.println(str1.length());
//		String flag = "";
//		System.out.println();
//		System.out.println(flag.equals("OK"));
//		System.out.println("OK".equals(flag));

	}

}
