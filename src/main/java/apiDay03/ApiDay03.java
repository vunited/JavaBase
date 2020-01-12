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
		// Date类 时间 日期
//		无参构造
//		Date dateNow = new Date();
//		System.out.println(dateNow);
////		有参构造
//		Date date_yesterday = new Date(2019 - 1900, 10 - 1, 11);
//		// 有参构造实例化Date对象，年份-1900 月份-1
//		System.out.println(date_yesterday);
//
////		setDate()   getDate()方法   获取 设置  日
////		dateNow.setDate(dateNow.getDate()+12);
//		System.out.println(dateNow);
//
////		getTime() 获取当前时间至1970.1.1日0：0：0 的毫秒数
//		long times = dateNow.getTime();
//		System.out.println(times);
////		dateNow.after(when) 
//		System.out.println(dateNow.after(date_yesterday));
////		dateNow.before(when)
//		System.out.println(dateNow.before(date_yesterday));
////		dateNow.compareTo(anotherDate)
//		System.out.println(date_yesterday.compareTo(dateNow));
////		dateNow.equals(obj)
////		dateNow.getDay()   set  一周的第几天 从周日 从0开始计算
////		dateNow.getHours()      小时 
////		dateNow.getMinutes()    分钟
////		dateNow.getMonth()      月份 从0开始
////		dateNow.getSeconds()    秒
////		dateNow.getYear()       年  从-1900开始
//
////		文本日期 Date日期 转换 需要引入SimpleDateFormat类
////		Date===》自定义文本格式
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
//		// 实例化SimpleDateFormat对象时，确定文本格式
//		String strDate = sdf.format(dateNow);
//		System.out.println(strDate);
//
////		文本日期===》Date
//		Date date01 = new Date();
//		String strDate01 = "2020年10月30日 10:47:30";
//		SimpleDateFormat sdf02 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//
//		try {
//			date01 = sdf02.parse(strDate01);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			System.out.println("日期格式错误");
//			e.printStackTrace();
//		}
//
//		System.out.println(date01);
////		case:
////		计算指定日期距现在多少天
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

//		Calendar 跟日期 时间 有关的 抽象类
//		实现子类  GregorianCalendar
//		获取当前日期
//		1.无参构造搭配实例方法
//		Calendar calen01 = new GregorianCalendar();
//		calen01.getTime(); // calendar对象的getTime方法返回值=====》 date
//		System.out.println(calen01.getTime());
////		2.静态方法
//		Calendar calen02 = Calendar.getInstance();
//		System.out.println(calen02.getTime());
//
//		calen01.set(2008, 10, 10); // set设置时间 月份从0开始
//		calen01.set(Calendar.YEAR, 2025);
//		calen01.set(Calendar.YEAR, 2030);
//		calen01.set(Calendar.MONTH, 11);
//		calen01.set(Calendar.MONTH, Calendar.FEBRUARY);
//		calen01.set(Calendar.DATE, 20);
//		System.out.println(calen01.getTime());
//
//		Calendar calen03 = new GregorianCalendar(2019, Calendar.DECEMBER, 28);
//		// 年份不用-1900 月份可以用常量代替
//		System.out.println(calen03.getTime());
////想获取什么属性，就写哪个属性，同一种方法
//		System.out.println(calen03.get(Calendar.YEAR));
//
////		年 Calendar.YEAR
////		月 Calendar.MONTH
////		日 Calendar.DATE
////		一天中第几小时 Calendar.HOUR_OF_DAY
////		上午 Calendar.AM
////		下午 Calendar.PM
////		小时 Calendar.HOUR
////		分钟 Calendar.MINUTE
////		一个月中第几天 Calendar.DAY_OF_MONTH
////		一周中第几天 Calendar.DAY_OF_WEEK
////		一年中第几天 Calendar.DAY_OF_YEAR
////		秒 Calendar.SECOND
////		一年中第几周 Calendar.WEEK_OF_YEAR
//
////		毫秒数
//		System.out.println(calen01.getTimeInMillis());
////		after before conpareTo equals
////		isLeapYear 判断是否是闰年 在GregorianCalendar子类中独有
//		System.out.println(((GregorianCalendar) calen03).isLeapYear(2012));
//
////		case: 用Calendar类实现
////		1.今天的100天之后的日期
//		Calendar calenDemo = new GregorianCalendar();
//		calenDemo.set(Calendar.DATE, calenDemo.get(Calendar.DATE) + 100);
//		System.out.println(calenDemo.getTime());
////		2.2016年8月27日 与 2015年5月20日相差多少天
//		System.out.println(((new GregorianCalendar(2016, 7, 27)).getTimeInMillis()
//				- (new GregorianCalendar(2015, 4, 20)).getTimeInMillis()) / 24 / 60 / 60 / 1000);

//		异常体系
//		体系结构： Throwable 异常类 --- 两个子类  Exception(异常)    Error（错误）
//		Exception(异常)：程序可以处理的异常
//		Error（错误）：程序无法处理的异常

//		异常分类 （Exception）：可查异常  不可查异常
//		可查异常： 除RuntimeException以及子类之外的其他Exception子类
//		不可查异常：RuntimeException以及子类

//		Java的异常处理机制： 抛出异常  捕获异常

//		异常处理关键字： 
//		throw    抛异常（行为）
//		throws  方法声明时 抛出异常  
//		{ try   catch   finally  } 

//		try catch final语法规则
//		try catch 捕获异常 格式： 
//		try {包含可能出现异常的代码}catch{捕获异常}finally{最终执行：不管try中出现异常与否，都执行的代码}
//		呼出try/catch   alt+shift+z		
//		try {
//			System.out.println("try语句1");
//			System.out.println(5 / 0);
//			System.out.println("try语句2");
//		} catch (Exception e) {
//			System.out.println("catch语句1");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("catch语句2");
//		} finally {
//			System.out.println("finally语句");
//		}
//
//		System.out.println("hello");
//		如果try语句中有return 先执行return 结果放入缓存区，再执行finally 执行结束后 输出缓存区return值
		System.out.println(add(2, 8));
		
//		常见异常
//		ArrayIndexOutOfBoundsException :异常子类 下标越界异常
//		int[] arr= {1,2,3,4};
//		System.out.println(arr[4]);
		
//		NullPointerException 空指针异常 引用对象为空
//		String str=null;
//		System.out.println(str.length());
		
//		ClassCastException 类转化异常 通常发生在类型转换时，上下转
//		Animal a1=new Animal();
//		Dog d1=(Dog)a1;
		
//		NumberFormatException  数字转化异常
//		int a=Integer.parseInt("abc");
		
//		ArithmeticException  算术异常  
//		System.out.println(5/0);
		
//		自定义异常 确认需要抛出异常的方法（throws） 对该方法进行搭建（什么情况下抛出异常）
//		新建异常类（继承于 Exception，确认message） 
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
//	1.有字符串集合，将该集合中元素转换为int类型，如有转换异常，捕获异常
			List<String> list=new ArrayList<String>();
			list.add("1");
			list.add("2");
			list.add("aa");
			list.add("3");
			list.add("6a");
//	2.
//	创建Student类
//	private String name;
//	private Integer age;
//	创建一个Student对象，给该对象赋值，如该对象名字中含有数字，报名字异常
			
			BigDecimal bd=new BigDecimal(10);
	}

	public static int add(int a, int b) {
		try {
			System.out.println("try语句1");
			return 0;
		} catch (Exception e) {
			System.out.println("catch语句");
		} finally {
			a = 1;
			System.out.println("finally语句");			
		}
		return a+b;
	}
}
