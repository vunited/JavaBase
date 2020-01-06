package com.test.apiDay02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import com.test.apiDay01.Member;

public class ApiDay02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		case:
//		1.	随机生成一组双色球红球号码 并输出 （利用Set集合）
//			例： 02   09   15  16   29   33    添0   有序   去重
//		Set<String> s1=new TreeSet<String>();
//		while(s1.size()<6) {
//			Random rd=new Random();
//			s1.add(formatCheck(rd.nextInt(33)+1));
//		}
//		System.out.println(s1);
////		for(;;) {
////			
////		}
//		
////		2.创建数组 arr{12,3,4,65,6,8,6,8,3}
////		   利用Set集合 找到数组中 重复的元素 并输出
//		int[] arr= {12,3,4,65,6,8,6,8,3};
//		Set s2=new HashSet();
//		for(int target:arr) {
//			if(!s2.add(target)) {
//				System.out.print(target+" ");
//			}
//		}
//		
////		3.创建类 Person 
////		  成员变量 String name 
////		        Integer age
////		        String entryTime(入职时间)
////		  创建集合 添加员工
////		张一    21      20190502001
////		王二    22      20190502002
////		李三    23      20181207001
////		孙四    24      20181129001
////		张五    25      20190502003
////		赵六    26      20180105001
////		李张七 27      20191001001
//
//		List<Person> persons=new ArrayList<Person>();
//		persons.add(new Person("张一",21,"20190502001"));
//		persons.add(new Person("王二",22,"20190502002"));
//		persons.add(new Person("李三",23,"20181207001"));
//		persons.add(new Person("孙四",24,"20181129001"));
//		persons.add(new Person("张五",25,"20190502003"));
//		persons.add(new Person("赵六",26,"20180105001"));
//		persons.add(new Person("李张七",27,"20191001001"));
////		1.找到入职时间最早的员工,并输出员工信息
//		//入职时间转换为long类型进行比较
//		long targetL=Long.parseLong(persons.get(0).getEntryTime());
//		Person p0=persons.get(0);
//		Iterator<Person> iterator=persons.iterator();
//		while(iterator.hasNext()) {
//			Person p=iterator.next();
//			long l=Long.parseLong(p.getEntryTime());
//			if(targetL>l) {
//				targetL=l;
//				p0=p;
//			}
//		}
//		System.out.println(p0.toString());
//		
//	//字符串compareTo比较
//		Person p00=persons.get(0);
//		Iterator<Person> iterator01=persons.iterator();
//		while(iterator01.hasNext()) {
//			Person p=iterator01.next();			
//			if(p00.getEntryTime().compareTo(p.getEntryTime())>0) {
//				p00=p;
//			}
//		}
//		System.out.println(p00.toString());
//		
//		
////		2.找到19年5月2日入职的员工,并输出员工信息
//		Iterator<Person> iterator02=persons.iterator();
//		while(iterator02.hasNext()) {
//			Person p=iterator02.next();			
//			if(p.getEntryTime().startsWith("20190502")) {
//				System.out.println(p.toString());
//			}
//		}
//		
//		
////		3.删除名字中含"张"的员工（使用迭代器）
////		注意：如使用迭代器删除,不能使用集合名.remove(...)   需要使用迭代器名.remove()
//		Iterator<Person> iterator03=persons.iterator();
//		while(iterator03.hasNext()) {
//			Person p=iterator03.next();			
////			if(p.getName().contains("张")) {
////				iterator03.remove();
////			}
//			if(p.getName().indexOf("张")!=-1) {
//				iterator03.remove();
//			}
//		}
//		iterator03=persons.iterator();
//		for(Person p:persons) {
//			p.toString();
//		}
//		System.out.println(persons);

//		Map接口  ：  存储   键 （key）   值  (value),以键值对形式存储 
//		其中 键（key）不能重复，值  (value)可以重复
//		Map接口实现类   HashMap
		Map<String, Integer> map01 = new HashMap<String, Integer>();
		map01.put("特朗普", 255);
//		map01.put("奥巴马",255 );
		map01.put("希拉里", 255);
		map01.put("希拉里2", 256);
		map01.put("希拉里3", 300);
		map01.put("奥巴马", 256); // 相同键值，value值覆盖原value值

//		map01.put(key, value) 添加一组键值对元素
//		map01.remove(key) 
//		System.out.println(map01.remove("克林顿")); //删除该键值对 返回该键对应的value值
//		map01.remove(key, value)
//		System.out.println(map01.remove("希拉里", 30)); //删除该键值对  返回boolean
//		map01.get(key)
//		System.out.println(map01.get("abc")); //形参为key值，返回对应的value值
//		map01.containsKey(key)
//		System.out.println(map01.containsKey("bbc"));
//		map01.containsValue(value)
//		System.out.println(map01.containsValue(255));
//		System.out.println(map01);
//
////		新建一个map集合，key类型为Member   value类型为Person  插入三组数据 
//		Map<Member, Person> map02 = new HashMap<Member, Person>();
//		map02.put(new Member(), new Person());
//		map02.put(new Member("", 10), new Person());
//		map02.put(new Member("", 12), new Person());
//		System.out.println(map02);
//
////		map集合的遍历
////		1.遍历所有key
//		Set<String> setMap = map01.keySet(); // 把map集合的key值 单独拿出成为一个单列集合 Set来接
//		Iterator<String> iteSetMap = setMap.iterator();
//		while (iteSetMap.hasNext()) {
//			System.out.println(iteSetMap.next());
//		}
////		2.遍历所有value
//		Collection<Integer> colMap = map01.values();
//		Iterator<Integer> iteColMap = colMap.iterator();
//		while (iteColMap.hasNext()) {
//			System.out.println(iteColMap.next());
//		}
////		3.遍历所有key 和 value
//		Set<Entry<String, Integer>> entrySet01 = map01.entrySet();// 把map集合变为泛型为双列模式的Set集合
//		for (Entry<String, Integer> e : entrySet01) {
//			System.out.println(e.getKey() + "=" + e.getValue());
//		}
//
////		case:
		int[] arr = { 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 2, 2, 2 };
////		找出重复次数最多的元素和重复次数。利用map集合
//
//		Map<Integer, Integer> mapDemo = new HashMap<Integer, Integer>(); //创建空map集合备用
//		for (int temp : arr) { //循环遍历目标数组，取得数组中每一个元素
//			if (mapDemo.containsKey(temp)) { //判断该元素是否已在集合key值中
//				mapDemo.put(temp, mapDemo.get(temp) + 1);   //如在，则添加进集合，value值在原值基础上加1
//			} else {                    
//				mapDemo.put(temp, 1);       //如不在，则添加进集合，value值为1
//			}
//		}
//		System.out.println(mapDemo);
//
//		int keyMax = arr[0];
//		int valueMax = mapDemo.get(arr[0]);
//		Set<Entry<Integer, Integer>> entryMap = mapDemo.entrySet(); //循环遍历map集合，找到集合中value最大的值和
//		for (Entry<Integer, Integer> e : entryMap) {                //其对应key值
//			if (valueMax < e.getValue()) {
//				valueMax = e.getValue();
//				keyMax = e.getKey();
//			}
//		}
//		System.out.println("出现次数为" + valueMax + ", 元素为" + keyMax);

//		Collections 操作集合的一个工具类   静态方法

		List<String> list = new ArrayList<String>();
		list.add(0, "l");
		list.add(1, "o");
		list.add(2, "v");
		list.add(3, "e");
		Collections.addAll(list, "y", "o", "u"); // 指定集合添加元素
		Collections.sort(list); // 指定集合自然排序
//		System.out.println(list);
//		Collections.reverse(list);   //指定集合反转顺序
		System.out.println(list);
		System.out.println(Collections.max(list)); // 查找指定集合中最大值
		System.out.println(Collections.binarySearch(list, "v")); // 返回有序(自然排序)集合中，元素值对应位置

//		集合  数组 互转  !!! 功能不完善
		Object[] ob = list.toArray(); // 集合转数组

		List list02 = Arrays.asList(arr); // 数组转集合
		System.out.println(list02.size());

	}

//	public static String formatCheck(int temp) {
//		if(temp<10) {
//			return "0"+temp;
//		}else {
//			return ""+temp;
//		}
//	}

}
