package com.test.oopDay02;

import com.test.javaBasic.JavaDay03;
import com.test.oopDay01.Student;

public class OopDay02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���úͶ���
//		==�����ã�����		
		Birthday b1 = new Birthday(1990, 7, 1);
		Birthday b2 = new Birthday();
		b2 = b1;

		Birthday b3 = new Birthday(2000, 4, 1);
		Birthday b4 = new Birthday(2000, 4, 1);

		System.out.println(b1 == b2);
		System.out.println(b3 == b4);

//		һ������ֻ����0����1�����á�
//		һ�����ÿ��Ա��������ָ��
//		"==" ��������ͣ��Ƚϵ��� ���� Ҳ����ָ��
//		     ��Ի����������ͣ��Ƚϵ��� ֵ
		Birthday b5;

		int[] a = { 3 };
		int[] b = { 3 };

		System.out.println(a == b);

//		this������
//		1.������췽���б�������������
//		2.���췽���п��Ե��������췽��������д�ڹ��췽����������
//		3.���Ե���������������
		b3.show();

//		�Զ����ɹ��췽��
//		Constructor  ���췽��
//		generate ����
//		alt+shift+s 

//		��� ��װ :��С�ɼ��ԣ���ֹ�����������ݱ��ⲿ��������� (���س�Ա������)
		b1.setYear(1986);
		System.out.println(b1.getYear());


//	�Զ�����set get����
//	alt+shift+s  generate setters and getters
		
//		�ؼ��֣� package import
//		package �� :ÿ����ǰ ��packageָ�����ڵİ�
//		import: ���� ����ǰ ������Ҫ�İ�����
		Student stu1=new Student();
		
//		�ؼ��� ��static ��̬
//		1 static�������α�������̬����---����� ��������ʾ�������ж����е����� ����ʱ�͸�ֵ
//		System.out.println(Person.nation);
//		Person p1=new Person();
//		p1.nation="�й�";
//		p1.id="007";
//		Person p2=new Person();		
//		p2.nation="����";
//		p2.id="888";
//		System.out.println(p1.id);
//		System.out.println(p1.nation);
//		2. static ���εķ��� �о�̬�������෽����
		
//		Person.setNation("��������");
//		System.out.println(Person.getNation());
//		Person.eat();
//		Person p1=new Person();
//		p1.show();
//		3. static ���εĴ���� �о�̬�����  
//		����飺 ��ʼ����
		Person p1=new Person();
		Person p2=new Person();
//		Person.eat();
//		Person.eat();
//		��̬����� ���� �������ʱ�� ����ִ��һ�� ֻ��һ��
//		�� ����˳���Ⱦ���
//		��̬���� --- ��̬����� --- ��̬���� --- ����� --- ���췽����
	}

}
