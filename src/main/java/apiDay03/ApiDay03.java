package com.test.apiDay03;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.test.oopDay03.Animal;
import com.test.oopDay03.Dog;

public class ApiDay03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Date�� ʱ�� ����
//		�޲ι���
//		Date dateNow = new Date();
//		System.out.println(dateNow);
////		�вι���
//		Date date_yesterday = new Date(2019 - 1900, 10 - 1, 11);
//		// �вι���ʵ����Date�������-1900 �·�-1
//		System.out.println(date_yesterday);
//
////		setDate()   getDate()����   ��ȡ ����  ��
////		dateNow.setDate(dateNow.getDate()+12);
//		System.out.println(dateNow);
//
////		getTime() ��ȡ��ǰʱ����1970.1.1��0��0��0 �ĺ�����
//		long times = dateNow.getTime();
//		System.out.println(times);
////		dateNow.after(when) 
//		System.out.println(dateNow.after(date_yesterday));
////		dateNow.before(when)
//		System.out.println(dateNow.before(date_yesterday));
////		dateNow.compareTo(anotherDate)
//		System.out.println(date_yesterday.compareTo(dateNow));
////		dateNow.equals(obj)
////		dateNow.getDay()   set  һ�ܵĵڼ��� ������ ��0��ʼ����
////		dateNow.getHours()      Сʱ 
////		dateNow.getMinutes()    ����
////		dateNow.getMonth()      �·� ��0��ʼ
////		dateNow.getSeconds()    ��
////		dateNow.getYear()       ��  ��-1900��ʼ
//
////		�ı����� Date���� ת�� ��Ҫ����SimpleDateFormat��
////		Date===���Զ����ı���ʽ
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
//		// ʵ����SimpleDateFormat����ʱ��ȷ���ı���ʽ
//		String strDate = sdf.format(dateNow);
//		System.out.println(strDate);
//
////		�ı�����===��Date
//		Date date01 = new Date();
//		String strDate01 = "2020��10��30�� 10:47:30";
//		SimpleDateFormat sdf02 = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
//
//		try {
//			date01 = sdf02.parse(strDate01);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			System.out.println("���ڸ�ʽ����");
//			e.printStackTrace();
//		}
//
//		System.out.println(date01);
////		case:
////		����ָ�����ھ����ڶ�����
//		String targetTime="1986-04-12";
//		Date dateBirth=new Date();
//		SimpleDateFormat sdf03 = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			dateBirth=sdf03.parse(targetTime);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println((dateNow.getTime()-dateBirth.getTime())/24/60/60/1000);

//		Calendar ������ ʱ�� �йص� ������
//		ʵ������  GregorianCalendar
//		��ȡ��ǰ����
//		1.�޲ι������ʵ������
//		Calendar calen01 = new GregorianCalendar();
//		calen01.getTime(); // calendar�����getTime��������ֵ=====�� date
//		System.out.println(calen01.getTime());
////		2.��̬����
//		Calendar calen02 = Calendar.getInstance();
//		System.out.println(calen02.getTime());
//
//		calen01.set(2008, 10, 10); // set����ʱ�� �·ݴ�0��ʼ
//		calen01.set(Calendar.YEAR, 2025);
//		calen01.set(Calendar.YEAR, 2030);
//		calen01.set(Calendar.MONTH, 11);
//		calen01.set(Calendar.MONTH, Calendar.FEBRUARY);
//		calen01.set(Calendar.DATE, 20);
//		System.out.println(calen01.getTime());
//
//		Calendar calen03 = new GregorianCalendar(2019, Calendar.DECEMBER, 28);
//		// ��ݲ���-1900 �·ݿ����ó�������
//		System.out.println(calen03.getTime());
////���ȡʲô���ԣ���д�ĸ����ԣ�ͬһ�ַ���
//		System.out.println(calen03.get(Calendar.YEAR));
//
////		�� Calendar.YEAR
////		�� Calendar.MONTH
////		�� Calendar.DATE
////		һ���еڼ�Сʱ Calendar.HOUR_OF_DAY
////		���� Calendar.AM
////		���� Calendar.PM
////		Сʱ Calendar.HOUR
////		���� Calendar.MINUTE
////		һ�����еڼ��� Calendar.DAY_OF_MONTH
////		һ���еڼ��� Calendar.DAY_OF_WEEK
////		һ���еڼ��� Calendar.DAY_OF_YEAR
////		�� Calendar.SECOND
////		һ���еڼ��� Calendar.WEEK_OF_YEAR
//
////		������
//		System.out.println(calen01.getTimeInMillis());
////		after before conpareTo equals
////		isLeapYear �ж��Ƿ������� ��GregorianCalendar�����ж���
//		System.out.println(((GregorianCalendar) calen03).isLeapYear(2012));
//
////		case: ��Calendar��ʵ��
////		1.�����100��֮�������
//		Calendar calenDemo = new GregorianCalendar();
//		calenDemo.set(Calendar.DATE, calenDemo.get(Calendar.DATE) + 100);
//		System.out.println(calenDemo.getTime());
////		2.2016��8��27�� �� 2015��5��20����������
//		System.out.println(((new GregorianCalendar(2016, 7, 27)).getTimeInMillis()
//				- (new GregorianCalendar(2015, 4, 20)).getTimeInMillis()) / 24 / 60 / 60 / 1000);

//		�쳣��ϵ
//		��ϵ�ṹ�� Throwable �쳣�� --- ��������  Exception(�쳣)    Error������
//		Exception(�쳣)��������Դ�����쳣
//		Error�����󣩣������޷�������쳣

//		�쳣���� ��Exception�����ɲ��쳣  ���ɲ��쳣
//		�ɲ��쳣�� ��RuntimeException�Լ�����֮�������Exception����
//		���ɲ��쳣��RuntimeException�Լ�����

//		Java���쳣������ƣ� �׳��쳣  �����쳣

//		�쳣����ؼ��֣� 
//		throw    ���쳣����Ϊ��
//		throws  ��������ʱ �׳��쳣  
//		{ try   catch   finally  } 

//		try catch final�﷨����
//		try catch �����쳣 ��ʽ�� 
//		try {�������ܳ����쳣�Ĵ���}catch{�����쳣}finally{����ִ�У�����try�г����쳣��񣬶�ִ�еĴ���}
//		����try/catch   alt+shift+z		
//		try {
//			System.out.println("try���1");
//			System.out.println(5 / 0);
//			System.out.println("try���2");
//		} catch (Exception e) {
//			System.out.println("catch���1");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("catch���2");
//		} finally {
//			System.out.println("finally���");
//		}
//
//		System.out.println("hello");
//		���try�������return ��ִ��return ������뻺��������ִ��finally ִ�н����� ���������returnֵ
		System.out.println(add(2, 8));
		
//		�����쳣
//		ArrayIndexOutOfBoundsException :�쳣���� �±�Խ���쳣
//		int[] arr= {1,2,3,4};
//		System.out.println(arr[4]);
		
//		NullPointerException ��ָ���쳣 ���ö���Ϊ��
//		String str=null;
//		System.out.println(str.length());
		
//		ClassCastException ��ת���쳣 ͨ������������ת��ʱ������ת
//		Animal a1=new Animal();
//		Dog d1=(Dog)a1;
		
//		NumberFormatException  ����ת���쳣
//		int a=Integer.parseInt("abc");
		
//		ArithmeticException  �����쳣  
//		System.out.println(5/0);
		
//		�Զ����쳣 ȷ����Ҫ�׳��쳣�ķ�����throws�� �Ը÷������д��ʲô������׳��쳣��
//		�½��쳣�ࣨ�̳��� Exception��ȷ��message�� 
		Person pDemo=new Person();
		try {
			pDemo.setAge(180);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		pDemo.setName("abc");
		
//	case:
//	1.���ַ������ϣ����ü�����Ԫ��ת��Ϊint���ͣ�����ת���쳣�������쳣
			List<String> list=new ArrayList<String>();
			list.add("1");
			list.add("2");
			list.add("aa");
			list.add("3");
			list.add("6a");
//	2.
//	����Student��
//	private String name;
//	private Integer age;
//	����һ��Student���󣬸��ö���ֵ����ö��������к������֣��������쳣
			
			BigDecimal bd=new BigDecimal(10);
	}

	public static int add(int a, int b) {
		try {
			System.out.println("try���1");
			return 0;
		} catch (Exception e) {
			System.out.println("catch���");
		} finally {
			a = 1;
			System.out.println("finally���");			
		}
		return a+b;
	}
}
