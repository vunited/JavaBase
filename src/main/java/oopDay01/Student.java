package com.test.oopDay01;

public class Student {
	
//	�ࣺ����ѧ��
	
//	���ԣ���Ա������ȫ�ֱ�����:�����������ı���  �粻��ֵ����Ĭ��ֵ
//	       �ֲ�����  : �ڷ����������ı���  ���븳ֵ����ʹ��
	String id; // ��Ա���� ѧ��
	String name; // ����
	String sex; // �Ա�
	String major; // רҵ
	int age; // ����

	
//��Ϊ����̬����
	public void study() {
		System.out.println(name+"��ѧϰ");
	}

	public void doSport() {
		System.out.println(name+"���˶�");
	}

	public void sleep() {
		System.out.println(name+"��˯��");
	}
	public void show() {
		System.out.println(name+","+id+","+sex+","+major+","+age);
	}
	//�޲ι��췽�� 
	public Student() {
		
	}
	//�вι��췽��(ȫ��)
	public Student(String _id,String _name,String _sex,String _major,int _age) {
		id=_id;
		name=_name;
		sex=_sex;
		major=_major;
		age=_age;
	}
	//�вι��췽��(���ֲ���)
	public Student(String _id,String _name) {
		id=_id;
		name=_name;
	}

}
