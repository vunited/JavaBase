package com.test.apiDay04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

public class ApiDay04 {
	public static void main(String[] args) {
		String strDemo = "abc";
		for (int i = 0; i < strDemo.length(); i++) {
			System.out.println(strDemo.charAt(i));
			if (strDemo.charAt(i) <= 57 && strDemo.charAt(i) >= 48) {
				System.out.println("error");
				break;
			}
		}

//		BigDecimal a=new BigDecimal(int/double/long/string);
		BigDecimal a = new BigDecimal("9");
		BigDecimal b = new BigDecimal("2.2");
//		为防止精度丢失，使用String类型作为参数
//		System.out.println(a.add(b));  //加法
//		System.out.println(a.subtract(b));  //减法
//		System.out.println(a.multiply(b));//乘法
//		System.out.println(a.divide(b)); //除法
//		System.out.println(a.remainder(b)); //余

		System.out.println(a.divide(b, 3, 4)); // 除法
		System.out.println(BigDecimal.ROUND_HALF_UP); // 四舍五入  4
		System.out.println(BigDecimal.ROUND_CEILING); // 向上进位  2
		System.out.println(BigDecimal.ROUND_FLOOR); // 不进位  3

//		保留几位小数  1
		double demoX=13.232423535;
		DecimalFormat df1=new DecimalFormat("0.000");
		String str=df1.format(demoX);
		System.out.println(str);
//		保留几位小数  2	
		String str02=String.format("%.5f", demoX);
		System.out.println(str02);
//		保留几位小数  3
		BigDecimal c = new BigDecimal(String.valueOf(demoX)).setScale(3,BigDecimal.ROUND_HALF_UP);
		System.out.println(c);
//		I/O : java对于操作系统中文件系统的支持
//		File类： 用于描述文件系统中 一个文件 或者 一个目录
//		File类功能： 通过file 可以获取文件或者目录的名字 大小  修改日期 。。。 但是！！！不能对文件内容进行访问
		
//		File的方法   exists()   判断当前file对象是否存在
		File file01=new File("D:\\test\\NewFile.java");  //反斜杠   双反斜杠 表示 文件夹从属关系
		if(file01.exists()) {
			System.out.println(file01.getName()); //获取文件名
			System.out.println(file01.length()); //文件大小
			System.out.println(file01.lastModified()); //最后修改时间
			System.out.println(file01.getPath()); //获取路径
			System.out.println(file01.canRead()); //是否可读
			System.out.println(file01.canWrite());//是否可写
			System.out.println(file01.canExecute()); //是否可执行
		}else {
			try {
				file01.createNewFile(); //创建新文件!!!!
				System.out.println("文件创建成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("文件创建失败");
			}
		}
		
//		创建目录!!!!!
		File file02=new File("D:\\test\\1\\2");
//		System.out.println(file02.mkdir()); //如果最后一级的父目录不存在，则无法创建
//		System.out.println(file02.mkdirs());
		
//		删除目录或文件
//		System.out.println(file02.delete()); //删除最后一级
		
//		判断file对象是否是文件
		System.out.println(file01.isFile());
		
//		判断file对象是否是目录
		System.out.println(file02.isDirectory());
		
//		获取file目录下的所有子项，以文件数组形式返回 !!!不包含子项的子项
		File[] file_arr=file02.listFiles();
		System.out.println(Arrays.toString(file_arr));
//		获取file目录下的所有子项，以字符串数组形式返回，只显示子项名 !!!不包含子项的子项
		String[] str_arr=file02.list();
		System.out.println(Arrays.toString(str_arr));
		
//		case:
//			1.查看D盘下子项，判断其是文件还是目录，
//			若是目录 就输出   目录：目录名
//			若是文件 就输出   文件： 文件名
//			File fileD=new File("D:\\apache-tomcat-8.5.34");
//			2.自己选定一个File目录对象， 输出该目录下所有子项
//			若子项是目录，继续输出其子项，直到所有文件都被输出
//			showFile(fileD);
			
//			I/O 数据流:两种  {字节流   字符流}
//			区别的：处理数据的最小单位，一个是字节，一个是字符。如果是纯文本文件，推荐使用字符流
			
//			字节流： 字节输入流  inputStream  字节输出流  outputStream
//			字节输入输出流
			try {
				FileInputStream fileIn=new FileInputStream("D:\\test\\有内容文件.txt");
				FileOutputStream fileOut =new FileOutputStream("D:\\test\\无内容文件.txt");				
				//读取文件内容
				int temp=0;				
				while((temp=fileIn.read())!=-1) {
					fileOut.write(temp);
				}
				fileIn.close();   //关闭输入流
				fileOut.close();   //关闭输出流
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				FileInputStream fileIn=new FileInputStream("D:\\test\\bg01.jpg");
//				File fileN=new File("D:\\test\\bg02.jpg");
//				fileN.createNewFile();
				FileOutputStream fileOut =new FileOutputStream("D:\\test\\bg02.jpg");				
				//读取文件内容
				int temp=0;
				
				while((temp=fileIn.read())!=-1) {
					fileOut.write(temp);
				}
				fileIn.close();   //关闭输入流
				fileOut.close();   //关闭输出流
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void showFile(File file) {   //写成方法 形参为file对象 方法功能为输出子项
		if(file==null) {
			return;
		}
		File[] file_arr=file.listFiles();   //转为file类型数组

		for(File f:file_arr) {   //遍历该数组
			if(f.isDirectory()) {   //判断是否为目录
				System.out.println("目录："+f);   //若是目录 则输出  并将该目录对象作为实参再次运行本方法
				showFile(f);
			}else {
				System.out.println("文件："+f);  //若是文件 直接输出
			}
		}
	}
}
