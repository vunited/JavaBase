package com.test.apiDay05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApiDay05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		I/O 数据流:两种  {字节流   字符流}
//		区别的：处理数据的最小单位，一个是字节，一个是字符。如果是纯文本文件，推荐使用字符流

//		字节流： 字节输入流  inputStream  字节输出流  outputStream
//		字节输入输出流
//		try {
//			FileInputStream fileIn=new FileInputStream("D:\\test\\有内容文件.txt");
//			FileOutputStream fileOut =new FileOutputStream("D:\\test\\无内容文件.txt");				
//			//读取文件内容
//			int temp=0;				
//			while((temp=fileIn.read())!=-1) {
//				fileOut.write(temp);
//			}
//			fileIn.close();   //关闭输入流
//			fileOut.close();   //关闭输出流
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			FileInputStream fileIn=new FileInputStream("D:\\test\\bg01.jpg");
////			File fileN=new File("D:\\test\\bg02.jpg");
////			fileN.createNewFile();
//			FileOutputStream fileOut =new FileOutputStream("D:\\test\\bg02.jpg");				
//			//读取文件内容
//			int temp=0;
//			
//			while((temp=fileIn.read())!=-1) {
//				fileOut.write(temp);
//			}
//			fileIn.close();   //关闭输入流
//			fileOut.close();   //关闭输出流
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	

//		缓冲字节输入 输出流 :可以减少读写次数  提高效率
//		BufferedInputStream   BufferedOutputStream
//		try {
//			BufferedInputStream buffIn=new BufferedInputStream(new FileInputStream("D:\\test\\有内容文件.txt"));
//			BufferedOutputStream buffOut=new BufferedOutputStream(new FileOutputStream("D:\\test\\无内容文件.txt"));
//			int temp=0;
//			while((temp=buffIn.read())!=-1) {
//				buffOut.write(temp);
//			}
//			
//			buffIn.close();
//			buffOut.flush();   //清缓冲区
//			buffOut.close();			
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		字符 输入 输出流 FileReader    FileWriter
//		try {
//			FileReader fileR=new FileReader("D:\\test\\有内容文件.txt");
//			FileWriter fileW=new FileWriter("D:\\test\\无内容文件.txt");
//			int temp=0;
//			while((temp=fileR.read())!=-1) {
//				System.out.print((char)temp);  //文件读写 可视
//				fileW.write(temp);				
//			}
//			fileW.write("哈哈哈");
//			
//			fileR.close();
//			fileW.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		缓冲字符 输入 输出流  BufferedReader   BufferedWriter

//		try {
//			BufferedReader buffR=new BufferedReader(new FileReader("D:\\test\\有内容文件.txt"));
//			BufferedWriter buffW=new BufferedWriter(new FileWriter("D:\\test\\无内容文件.txt"));
//			int temp=0;
//			while((temp=buffR.read())!=-1) {
//				System.out.print((char)temp);  //文件读写 可视
//				buffW.write(temp);				
//			}
//			buffW.write("哈哈哈");
//			buffW.append("谢谢");
//			buffW.append("不用");
//			
//			buffR.close();
//			buffW.flush();
//			buffW.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		Student stu1 = new Student("张一", 21);
//		stu1.addScore("语文", 80);
//		stu1.addScore("数学", 98);
//		stu1.addScore("英语", 76);
//		Student stu2 = new Student("张二", 22);
//		stu2.addScore("语文", 80);
//		stu2.addScore("数学", 98);
//		stu2.addScore("英语", 76);
//		Student stu3 = new Student("张三", 23);
//		stu3.addScore("语文", 80);
//		stu3.addScore("数学", 98);
//		stu3.addScore("英语", 76);
//
//		List<Student> listStu = new ArrayList<Student>();
//		listStu.add(stu1);
//		listStu.add(stu2);
//		listStu.add(stu3);		
//		try {
//			BufferedWriter buffW=new BufferedWriter(new FileWriter("D:\\test\\成绩单.csv"));
//			for(Student s:listStu) {
//				buffW.write(s.toString());
//			}
//			buffW.flush();
//			buffW.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//      case：   从文件读取字符串  压缩至新文本文件
//		1.读取等待压缩的文件  缓冲字符输入流
//		2.建立空list集合 泛型为char
//		3.读取字符 添加至list集合
//		4.遍历该集合 （for遍历） 进行压缩操作（参考之前）
//		5.得到压缩后的字符串
//		6.将该字符串写入新文件  缓冲字符输出流
		try {
			BufferedReader buffR = new BufferedReader(new FileReader("D:\\test\\待压缩字符串.txt"));
			BufferedWriter buffW = new BufferedWriter(new FileWriter("D:\\test\\压缩后字符串.txt"));
			int charValue = 0;
			List<Character> targetList = new ArrayList<Character>();
			while ((charValue = buffR.read()) != -1) {
				targetList.add((char) charValue);
			}
			
			targetList.add(' ');			
			StringBuffer strB = new StringBuffer();
			int count = 1;			
			for (int i = 1; i < targetList.size(); i++) {
				if (targetList.get(i) == targetList.get(i-1)) {
					count++;
				} else {
					if (count != 1) {
						strB.append(count);
						count = 1;
					}
					strB.append(targetList.get(i-1));
				}
			}
			buffW.write(strB.toString());
			buffR.close();
			buffW.flush();
			buffW.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
