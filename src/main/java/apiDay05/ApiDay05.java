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
//		I/O ������:����  {�ֽ���   �ַ���}
//		����ģ��������ݵ���С��λ��һ�����ֽڣ�һ�����ַ�������Ǵ��ı��ļ����Ƽ�ʹ���ַ���

//		�ֽ����� �ֽ�������  inputStream  �ֽ������  outputStream
//		�ֽ����������
//		try {
//			FileInputStream fileIn=new FileInputStream("D:\\test\\�������ļ�.txt");
//			FileOutputStream fileOut =new FileOutputStream("D:\\test\\�������ļ�.txt");				
//			//��ȡ�ļ�����
//			int temp=0;				
//			while((temp=fileIn.read())!=-1) {
//				fileOut.write(temp);
//			}
//			fileIn.close();   //�ر�������
//			fileOut.close();   //�ر������
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
//			//��ȡ�ļ�����
//			int temp=0;
//			
//			while((temp=fileIn.read())!=-1) {
//				fileOut.write(temp);
//			}
//			fileIn.close();   //�ر�������
//			fileOut.close();   //�ر������
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	

//		�����ֽ����� ����� :���Լ��ٶ�д����  ���Ч��
//		BufferedInputStream   BufferedOutputStream
//		try {
//			BufferedInputStream buffIn=new BufferedInputStream(new FileInputStream("D:\\test\\�������ļ�.txt"));
//			BufferedOutputStream buffOut=new BufferedOutputStream(new FileOutputStream("D:\\test\\�������ļ�.txt"));
//			int temp=0;
//			while((temp=buffIn.read())!=-1) {
//				buffOut.write(temp);
//			}
//			
//			buffIn.close();
//			buffOut.flush();   //�建����
//			buffOut.close();			
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		�ַ� ���� ����� FileReader    FileWriter
//		try {
//			FileReader fileR=new FileReader("D:\\test\\�������ļ�.txt");
//			FileWriter fileW=new FileWriter("D:\\test\\�������ļ�.txt");
//			int temp=0;
//			while((temp=fileR.read())!=-1) {
//				System.out.print((char)temp);  //�ļ���д ����
//				fileW.write(temp);				
//			}
//			fileW.write("������");
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

//		�����ַ� ���� �����  BufferedReader   BufferedWriter

//		try {
//			BufferedReader buffR=new BufferedReader(new FileReader("D:\\test\\�������ļ�.txt"));
//			BufferedWriter buffW=new BufferedWriter(new FileWriter("D:\\test\\�������ļ�.txt"));
//			int temp=0;
//			while((temp=buffR.read())!=-1) {
//				System.out.print((char)temp);  //�ļ���д ����
//				buffW.write(temp);				
//			}
//			buffW.write("������");
//			buffW.append("лл");
//			buffW.append("����");
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

//		Student stu1 = new Student("��һ", 21);
//		stu1.addScore("����", 80);
//		stu1.addScore("��ѧ", 98);
//		stu1.addScore("Ӣ��", 76);
//		Student stu2 = new Student("�Ŷ�", 22);
//		stu2.addScore("����", 80);
//		stu2.addScore("��ѧ", 98);
//		stu2.addScore("Ӣ��", 76);
//		Student stu3 = new Student("����", 23);
//		stu3.addScore("����", 80);
//		stu3.addScore("��ѧ", 98);
//		stu3.addScore("Ӣ��", 76);
//
//		List<Student> listStu = new ArrayList<Student>();
//		listStu.add(stu1);
//		listStu.add(stu2);
//		listStu.add(stu3);		
//		try {
//			BufferedWriter buffW=new BufferedWriter(new FileWriter("D:\\test\\�ɼ���.csv"));
//			for(Student s:listStu) {
//				buffW.write(s.toString());
//			}
//			buffW.flush();
//			buffW.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//      case��   ���ļ���ȡ�ַ���  ѹ�������ı��ļ�
//		1.��ȡ�ȴ�ѹ�����ļ�  �����ַ�������
//		2.������list���� ����Ϊchar
//		3.��ȡ�ַ� �����list����
//		4.�����ü��� ��for������ ����ѹ���������ο�֮ǰ��
//		5.�õ�ѹ������ַ���
//		6.�����ַ���д�����ļ�  �����ַ������
		try {
			BufferedReader buffR = new BufferedReader(new FileReader("D:\\test\\��ѹ���ַ���.txt"));
			BufferedWriter buffW = new BufferedWriter(new FileWriter("D:\\test\\ѹ�����ַ���.txt"));
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
