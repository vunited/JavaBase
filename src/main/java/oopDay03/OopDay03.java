package com.test.oopDay03;

public class OopDay03 {
	public static void main(String[] args) {
//		int String ��ת
//		int x = 10;
//		String str = String.valueOf(x);
//		System.out.println(str+2);
//		
//		int num=Integer.parseInt("3"+"7");
//		System.out.println(num);
//		String ��չ��������
//		StringBuilder 
//		StringBuilder stb = new StringBuilder();
//		stb.append("abc");
//		stb.append("edf");
//		stb.append("xxx");
//		System.out.println(stb); // StringBuilder����
//		System.out.println(String.valueOf(stb)); // String ����
//		System.out.println(stb.toString()); // String ����
//
////		StringBuffer
//		StringBuffer stb2 = new StringBuffer();
//		stb2.append("bbc");
//		stb2.append("bbq");
//		System.out.println(stb2); // StringBuffer����
//		System.out.println(String.valueOf(stb2)); // String ����
//		System.out.println(stb2.toString()); // String ����

//		��̬�ַ��������ٶȣ�Ч�ʣ��� StringBuilder > StringBuffer  > String
//		���밲ȫ�ԣ�StringBuffer > StringBuilder > String
//		StringBuilder��֧�ֶ��̣߳�����

//		�̳У� extends   a extends b  a�̳�b
//		b����Ϊ����(fatherClass) ��  ����(superClass)
//		a����Ϊ����(childClass,subClass) �� �̳���(derivedClass)
//		�̳еĶ��壺�¶���һ���࣬�����е����� ��ȡ���Ժ���Ϊ
//		Student stu1=new Student();
//		Person p1=new Person();
//		stu1.name="studentһ��";
//		stu1.eat();

//		Java�ǵ��̳�
//		һ����������ж������
//		һ������ֻ�ܼ̳���һ������

//		�������� Overload :����ͬ����ͬ��

//		������д Override
//		1.������Ը���̳й����ķ��� ������ʱ�����Խ��з�����д
//		2.��дʱ��Ҫ�� ͬ��ͬ��ͬ��������
//		3.��дʱ����д�ķ��� ����ӵ�и���ĸ÷������ϸ�Ŀɼ���
//		4.ֻҪ���෽����д������ʵ��������ֻ�ܵ�����д������෽��
//		5.��д����ʱ�����Լ� @Overrideע�⣬��ǿ����ɶ��ԣ�����ϵͳ��ǿ����ɱ�����
//		Student stu1 = new Student();
//		stu1.setName("����");
//		stu1.setId("2102028888888");
//		stu1.setSid("20190929333");
//		stu1.setSex("��");
//		stu1.setAge("18");
//		stu1.show();

//		�ؼ��� Super
//		1.super���Ե��ø��෽��,�ͳ�Ա����
//		2.super���Ե��ø��๹�췽��
//		    2.1  ���������Ĺ����У�������ø���Ĺ��췽��
//		    2.2 ϵͳĬ�ϵ��ø�����޲ι��췽��
//		    2.3 ���ø��๹�췽�������������๹�췽������
//		Student stu2 = new Student("21020319952222222", "����", "201534524", "Ů", "17");
//		stu2.show();

//		�ؼ��� final
//		final�������α���==�� ����
//		final int A = 10;
//		final�������η���
//		final���εķ��� ���ܱ���д������

//		final���ε��� ���ܱ��̳У�����

//		Animal ani01 = new Animal("С��");
////		Cat cat01 = new Cat("��", "��ɫ");
//		
////		��ת�ͣ��������ã��������ͣ� ָ�� �������
//		Animal ani02=new Cat("����","��ɫ");
//		ani02.eat();
//		ani02.shout();
//		ani02.sleep();
//		ani02.catchMouse();
//		��ת�͵Ķ����ܹ����ø��෽�����ܹ�����������д���ĸ��෽��
//		���ܵ���������з���
//		Animal ani03=new Dog("����","��ɫ");
//		ani02.shout();
//		ani03.shout();
////		��̬�󶨣�����ʵ��ҵ����Ҫ����������ָ��ͬ�������ʵ�ֲ�ͬ���ܣ�������̬�󶨡�
////		��̬���Ƕ�̬�ĺ��ļ���֮һ��
//		
////		��ת�� ���������� ��ֵ���������� �������ԭ��Ϊ�������ͣ�ǿתΪ�������� ǿת����Ϊԭ�������������
//		Cat cat01=(Cat)ani02;
//		cat01.catchMouse();
//		cat01.shout();
//		Dog dog01=(Dog)ani03;
//		dog01.guard();

		/*
		 * Animal ani02=new Cat("����","��ɫ"); Cat cat01=(Cat)ani02; ��ͬ�� ====> Cat
		 * cat01=new Cat("����","��ɫ");
		 */
//		Object ob=new String("test");
//		String str=(String)ob;
//		System.out.println(str);

//		Animal ani01 = new Cat("����", "��ɫ");
//		Animal ani02 = new Dog("����", "��ɫ");
//		if (ani02 instanceof Cat) { // a instanceof b �ж�a�Ƿ�Ϊb���͵Ķ���
//			Cat cat01 = (Cat) ani01;
//			cat01.catchMouse();
//		} else {
//			System.out.println("è����Ķ�����ת����è");
//		}

//		��̬������
//		ͬһ�¼����ڲ�ͬ�����ϣ����ֲ�ͬЧ��
//		��̬���� �����ڲ���̬(����)   �̳�ʽ��̬
		demo();
		demo(5);

//		�̳�ʽ��̬ : ��Ҫ����---Ҫ�м̳�  Ҫ�з�����д  Ҫ����ת��
		Animal[] animals = new Animal[3];
		animals[0] = new Cat("èһ", "��ɫ");
		animals[1] = new Dog("��һ", "��ɫ");
		animals[2] = new Cat("è��", "��ɫ");
		
//		Animal[] animals02= {new Cat("èһ", "��ɫ"),new Dog("��һ", "��ɫ"),new Cat("è��", "��ɫ")};

		for (Animal a : animals) {
			a.shout();
		}

		for (Animal a : animals) {
			if (a instanceof Cat) {
				Cat cat01 = (Cat) a;
				cat01.catchMouse();
			}
			if (a instanceof Dog) {
				Dog dog01 = (Dog) a;
				dog01.guard();
			}
		}

	}

	public static void demo() {

	}

	public static void demo(int a) {

	}
}
