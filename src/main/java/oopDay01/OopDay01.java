package com.test.oopDay01;

public class OopDay01 {

	public static void main(String[] args) {
		String id;// �ֲ����� : �ڷ����������ı���

		// TODO Auto-generated method stub
		// OOP: object oriented programming ���������

//		��Զ�����һ�ֱ��˼�룬java�У����еĲ��������Ƕ� ���������
//		�ͷ������в�����
//		���������ص㣺��װ���̳У���̬������

//		��Ͷ���
//		�ࣺ������ʵ�����һ������ĳ������
//		���� ��ľ���ʵ��     
//		�ܽ��������Զ���

//		������
//		���ԣ�ȫ�ֱ�������Ա������
//		��Ϊ����̬����

//		�������� --- ʵ��������     ��ʽ��  ����   ������ =  new  �๹�췽��
//		Student stu1 = new Student();
//		Student stu2 = new Student();
//		stu1.id = "2019070324";
//		stu2.id = "2019070325";
//		stu1.name = "��ʮ��";
//		stu1.sex = "��";
//		stu1.major = "�������";
//		stu1.age = 18;
//		stu1.name = "��ʮ��";
//		stu1.sleep();
//		stu1.show();
//		Student[] stus = { stu1, stu2 };
//		int[] arr = { 2, 3, 4, 5 };
//
//		
//		
//		stu2.name = "��ʮ��";
//		stu2.sex = "��";
//		stu2.major = "�������";
//		stu2.age = 18;
//		stu2.show();
//		
//		Car car01=new Car();
//		car01.brand="Benz";
//		car01.engineType="V6";
//		car01.run();
//		
//		System.out.println(stu1.id);
//		System.out.println(stu2.id);
//		Student stu3=new Student();
//		System.out.println(stu3.id);
//		System.out.println(stu3.age);
//		
////		���췽�������캯�� �����壩
////		���췽��ʹ�õĵط���ʵ��������ʱ �ؼ���new ����
//		Student stu4 = new Student("8888","����","Ů","�ƻ�",20);
////		���췽���ص㣺
////		���췽���� ��������ͬ		
////		���췽�� û�з���ֵ������дvoid
////		������ʱ��ϵͳ�ṩĬ�ϵ��޲ι��췽��
////		����û��Զ��幹�췽����ϵͳ�ջ��ṩ���޲ι��췽��������
//		stu4.show();
//		Student stu5=new Student("6666","����");
//		stu5.sex="��";
//		stu5.name="��һ";
//		Cube cu1 = new Cube(2.5);
//		System.out.println(cu1.area());
//		System.out.println(cu1.totalLength());

//		case:
//			Circle   
//			����  r
//			
//			���� ��  
//			���    Math.PI *r*r
//			�ܳ�    2*Math.PI*r

//		case:
//			���������ࣺ
//			1����˾��   Company
//			  ����  ��˾ID   ��˾��    ְԱ��
//			2��ְԱ��  Member
//			 ����   Ա������   Ա������  Ա���Ա�   Ա������   Ա������
//			main�����У� �������� ��˾1��DHC���Զ���5��Ա���������˾��ÿ��Ա������Ϣ
//			             �������� ��˾2��IBM���Զ���5��Ա���������˾��ÿ��Ա������Ϣ
//			             Student[] stus= {stu1,stu2};

		Company com1 = new Company();
		com1.cid = "001";
		com1.name = "DHC";
		Member m1 = new Member("20190926", "��һ", '��', "PL", 5500);
		Member m2 = new Member("20190927", "����", '��', "PG", 5000);
		Member m3 = new Member("20190928", "����", '��', "PG", 5000);
		Member m4 = new Member("20190929", "����", '��', "PG", 5000);
		Member m5 = new Member("20190920", "����", '��', "PG", 5000);
		Member m6 = new Member("20190921", "����", '��', "PG", 5000);
		com1.addMem(m1);
		com1.addMem(m2);
		com1.addMem(m3);
		com1.addMem(m4);
		com1.addMem(m5);
		com1.addMem(m6);
		com1.show();
		
		Member[] members=new Member[5];
		Company com2=new Company("002","IBM",members,0);
		com2.addMem(m1);
		com2.addMem(m2);
		com2.addMem(m3);
		com2.addMem(m4);
		com2.addMem(m5);
		com2.addMem(m6);
		com2.show();
		
		
		
	}

}
