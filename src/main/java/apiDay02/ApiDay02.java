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
//		1.	�������һ��˫ɫ�������� ����� ������Set���ϣ�
//			���� 02   09   15  16   29   33    ��0   ����   ȥ��
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
////		2.�������� arr{12,3,4,65,6,8,6,8,3}
////		   ����Set���� �ҵ������� �ظ���Ԫ�� �����
//		int[] arr= {12,3,4,65,6,8,6,8,3};
//		Set s2=new HashSet();
//		for(int target:arr) {
//			if(!s2.add(target)) {
//				System.out.print(target+" ");
//			}
//		}
//		
////		3.������ Person 
////		  ��Ա���� String name 
////		        Integer age
////		        String entryTime(��ְʱ��)
////		  �������� ���Ա��
////		��һ    21      20190502001
////		����    22      20190502002
////		����    23      20181207001
////		����    24      20181129001
////		����    25      20190502003
////		����    26      20180105001
////		������ 27      20191001001
//
//		List<Person> persons=new ArrayList<Person>();
//		persons.add(new Person("��һ",21,"20190502001"));
//		persons.add(new Person("����",22,"20190502002"));
//		persons.add(new Person("����",23,"20181207001"));
//		persons.add(new Person("����",24,"20181129001"));
//		persons.add(new Person("����",25,"20190502003"));
//		persons.add(new Person("����",26,"20180105001"));
//		persons.add(new Person("������",27,"20191001001"));
////		1.�ҵ���ְʱ�������Ա��,�����Ա����Ϣ
//		//��ְʱ��ת��Ϊlong���ͽ��бȽ�
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
//	//�ַ���compareTo�Ƚ�
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
////		2.�ҵ�19��5��2����ְ��Ա��,�����Ա����Ϣ
//		Iterator<Person> iterator02=persons.iterator();
//		while(iterator02.hasNext()) {
//			Person p=iterator02.next();			
//			if(p.getEntryTime().startsWith("20190502")) {
//				System.out.println(p.toString());
//			}
//		}
//		
//		
////		3.ɾ�������к�"��"��Ա����ʹ�õ�������
////		ע�⣺��ʹ�õ�����ɾ��,����ʹ�ü�����.remove(...)   ��Ҫʹ�õ�������.remove()
//		Iterator<Person> iterator03=persons.iterator();
//		while(iterator03.hasNext()) {
//			Person p=iterator03.next();			
////			if(p.getName().contains("��")) {
////				iterator03.remove();
////			}
//			if(p.getName().indexOf("��")!=-1) {
//				iterator03.remove();
//			}
//		}
//		iterator03=persons.iterator();
//		for(Person p:persons) {
//			p.toString();
//		}
//		System.out.println(persons);

//		Map�ӿ�  ��  �洢   �� ��key��   ֵ  (value),�Լ�ֵ����ʽ�洢 
//		���� ����key�������ظ���ֵ  (value)�����ظ�
//		Map�ӿ�ʵ����   HashMap
		Map<String, Integer> map01 = new HashMap<String, Integer>();
		map01.put("������", 255);
//		map01.put("�°���",255 );
		map01.put("ϣ����", 255);
		map01.put("ϣ����2", 256);
		map01.put("ϣ����3", 300);
		map01.put("�°���", 256); // ��ͬ��ֵ��valueֵ����ԭvalueֵ

//		map01.put(key, value) ���һ���ֵ��Ԫ��
//		map01.remove(key) 
//		System.out.println(map01.remove("���ֶ�")); //ɾ���ü�ֵ�� ���ظü���Ӧ��valueֵ
//		map01.remove(key, value)
//		System.out.println(map01.remove("ϣ����", 30)); //ɾ���ü�ֵ��  ����boolean
//		map01.get(key)
//		System.out.println(map01.get("abc")); //�β�Ϊkeyֵ�����ض�Ӧ��valueֵ
//		map01.containsKey(key)
//		System.out.println(map01.containsKey("bbc"));
//		map01.containsValue(value)
//		System.out.println(map01.containsValue(255));
//		System.out.println(map01);
//
////		�½�һ��map���ϣ�key����ΪMember   value����ΪPerson  ������������ 
//		Map<Member, Person> map02 = new HashMap<Member, Person>();
//		map02.put(new Member(), new Person());
//		map02.put(new Member("", 10), new Person());
//		map02.put(new Member("", 12), new Person());
//		System.out.println(map02);
//
////		map���ϵı���
////		1.��������key
//		Set<String> setMap = map01.keySet(); // ��map���ϵ�keyֵ �����ó���Ϊһ�����м��� Set����
//		Iterator<String> iteSetMap = setMap.iterator();
//		while (iteSetMap.hasNext()) {
//			System.out.println(iteSetMap.next());
//		}
////		2.��������value
//		Collection<Integer> colMap = map01.values();
//		Iterator<Integer> iteColMap = colMap.iterator();
//		while (iteColMap.hasNext()) {
//			System.out.println(iteColMap.next());
//		}
////		3.��������key �� value
//		Set<Entry<String, Integer>> entrySet01 = map01.entrySet();// ��map���ϱ�Ϊ����Ϊ˫��ģʽ��Set����
//		for (Entry<String, Integer> e : entrySet01) {
//			System.out.println(e.getKey() + "=" + e.getValue());
//		}
//
////		case:
		int[] arr = { 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 2, 2, 2 };
////		�ҳ��ظ���������Ԫ�غ��ظ�����������map����
//
//		Map<Integer, Integer> mapDemo = new HashMap<Integer, Integer>(); //������map���ϱ���
//		for (int temp : arr) { //ѭ������Ŀ�����飬ȡ��������ÿһ��Ԫ��
//			if (mapDemo.containsKey(temp)) { //�жϸ�Ԫ���Ƿ����ڼ���keyֵ��
//				mapDemo.put(temp, mapDemo.get(temp) + 1);   //���ڣ�����ӽ����ϣ�valueֵ��ԭֵ�����ϼ�1
//			} else {                    
//				mapDemo.put(temp, 1);       //�粻�ڣ�����ӽ����ϣ�valueֵΪ1
//			}
//		}
//		System.out.println(mapDemo);
//
//		int keyMax = arr[0];
//		int valueMax = mapDemo.get(arr[0]);
//		Set<Entry<Integer, Integer>> entryMap = mapDemo.entrySet(); //ѭ������map���ϣ��ҵ�������value����ֵ��
//		for (Entry<Integer, Integer> e : entryMap) {                //���Ӧkeyֵ
//			if (valueMax < e.getValue()) {
//				valueMax = e.getValue();
//				keyMax = e.getKey();
//			}
//		}
//		System.out.println("���ִ���Ϊ" + valueMax + ", Ԫ��Ϊ" + keyMax);

//		Collections �������ϵ�һ��������   ��̬����

		List<String> list = new ArrayList<String>();
		list.add(0, "l");
		list.add(1, "o");
		list.add(2, "v");
		list.add(3, "e");
		Collections.addAll(list, "y", "o", "u"); // ָ���������Ԫ��
		Collections.sort(list); // ָ��������Ȼ����
//		System.out.println(list);
//		Collections.reverse(list);   //ָ�����Ϸ�ת˳��
		System.out.println(list);
		System.out.println(Collections.max(list)); // ����ָ�����������ֵ
		System.out.println(Collections.binarySearch(list, "v")); // ��������(��Ȼ����)�����У�Ԫ��ֵ��Ӧλ��

//		����  ���� ��ת  !!! ���ܲ�����
		Object[] ob = list.toArray(); // ����ת����

		List list02 = Arrays.asList(arr); // ����ת����
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
