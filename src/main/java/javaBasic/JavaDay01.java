package com.test.javaBasic;

public class JavaDay01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������
//		println ������� print���
//		System.out.println("Java Run Test ������");
//		System.out.print("2");
//		System.out.print("3");
//		System.out.println("4");
//		System.out.println("5");
//        JavaDay01   Java_day_01
//		f���� ճ�� ���� ����  ���� ctrl +  c  v   x   f   s
//		����  ȡ������   z   y   
//		ctrl  +  shift  + l  �鿴���п�ݼ�
//		ctrl   +  shit  + F   �����ʽ��׼�� 
//      ctrl  /   
//      ctrl   shift   /

//		1.���� ���� 
//		2.֧�ֵ���������
//		3.֧�ֵķ���
//		4.���̿������ �ж� ѭ��
//		5.�������еĹ��� 

//		������ ���Ըı���� 
//		������ʹ�÷����� �������������ĵ�����  �ٸ�ֵ
//		����������  �������� ������
//		int a;
////		��ֵ
//		a = 20;
//		System.out.println(a);
//		a = 50;
//		System.out.println(a + a + 8);
//
////		������ һ����ֵ ���ɸ���   final �������� ������ 
//		final int B;
//		B = 50;
//		System.out.println(B);
//
//		int b=5,c=7,d=20;
//		int e,f,g;

//		��������
//		8�ֻ�����������   +   �� ����(ϵͳ�̳е����� String �Ķ������� object +  �Զ���  )
//		������        byte     short           int          long   
//		 �ֽ���     1��8λ��    2                 4            8
//		 ��Χ      -128~127   -32768~32767     ����21��               
//		������    float  double 
//		�ֽ���      4        8
//		float �����ȸ�������    
//		double ˫���ȸ�������  
//		������  boolean   :  ����ֵ  true  false
//		�ַ���  char: ���Դ�ŵ�����ĸ ���� ����

//		byte byte01=20;
//		short short01=30000;
//		long long01=72487334234234L;   //long�ͱ�����ֵ   ֵ�����ĸL
//		
//		float f1=4.564f;   //float�ͱ�����ֵ  ֵ�����ĸF
//		double d1=3.1415926;   //double�ͱ�����ֵ  ֵ��ɼ���ĸD  Ҳ��ʡ��
//		boolean flag=true;
//		char c1='��';
//		char c2='t';

//		int a=10,b=20;
//		int temp=a;
//		a=b;
//		b=temp;

//		���ݾ��� �ӵ͵��ߣ� byte  short  int   long   float  double 
//		������������֮���ת������

//		�Ӹߵ���  �߾��ȵ�ֵ��ֵ���;��ȱ���  ��Ҫǿ��ת��  ǿת��ֵ�������
//		int a=100;
//		byte b=(byte)a;
//		System.out.println(b);
//		
////		�ӵ͵��� �;��ȵ�ֵ��ֵ���߾��ȱ���  ֱ��ת��
//		byte c=125;
//		int d=c;
//		
////		������ת���� ȡ��  ����������
//		float f1=3.14f;
//		int i1=(int)f1;
//		System.out.println(i1);

		// ��ͬ�������� ���ȵ;����Զ����߾���ת�� ����һ�º��������
//		1.����Ĭ��int��
//		2.����ʱ��Ҫ����һ��
//		int d=(int)(2+1.5f+3.5d);
////		2+1.5f+3.5d  ====��   2.0d+1.5d+3.5d    ===>  7.0d  ===> 7
//		System.out.println(d);
//		
//		����
//		����������� + - * / %
//		int x = 20;
//		int y = 3;
//		String s = "3";
//		System.out.println(x + s);
////		1.+ ���� ֻҪ��һ�಻Ϊ��ֵ�� ��+ �����ӷ����� ����ƴ�ӷ�
//		System.out.println(x + x + s); // 403
//		System.out.println(s + x + x); // 32020
//		System.out.println("" + x + y);
//
//		System.out.println(x - y);
//		System.out.println(x * y);
//		System.out.println(x / y); // ȡ�� ����������
//		System.out.println(x % y);
//
//		int demo = 43462;
//		System.out.println(demo / 10000);
//		System.out.println(demo / 1000 % 10); // 43 3
//		System.out.println(demo / 100 % 10);
//		System.out.println(demo / 10 % 10);
//		System.out.println(demo % 10);
//
//		System.out.println(demo / 10000);
//		System.out.println(demo % 10000 / 1000); // 3462 3
//		System.out.println(demo % 1000 / 100);
//		System.out.println(demo % 100 / 10);
//		System.out.println(demo % 10);

//��ֵ����� = += -=  *=   /=  %=
//int a=6;
//		a+=6; //====>  a=a+6
//		a%=6;//  a=a%6

		// a+=b a=a+b

//		int a=6;
//		double b=3.6;
//		a+=b;
//		a=(int)(a+b);

////		�Ƚ������ >  <   >=  <=  ==  !=   �Ƚ���������ӵ���ʽ���λΪ boolean��ֵ
//		int a=20;
//		int b=30;
//		System.out.println(a>=b);
//		
////		�߼������ &&  ||   !
//		true&&false   
//		true||false 

//		�����Լ������  ++  --
//		a++   ++a 

//		��Ŀ�����   (����)?ֵ1:ֵ2
//		int a=23,b=35;
//		System.out.println((a>b)?a:b);

//		���̿������
//		�ж�
//		����֧��
//		if(����) {
//			
//		}
//		
//		˫��֧��
//		if() {
//			
//		}else {
//			
//		}
//		
//		���֧��
//		if() {
//			
//		}else if() {
//			
//		}else if() {
//			
//		}else {
//			
//		}
//		switch //switch(demo)  demo������ byte  short  int  char �е�һ��
//		int demo = 3;
//		switch (demo + 10) {
//		case 1:
//			System.out.println("1");
//			break;
//		case 2:
//			System.out.println("2");
//			break;
//		case 3:
//			System.out.println("3");
//			break;
//		case 4:
//			System.out.println("4");
//			break;
//		default:
//			System.out.println("5");
//		}
//
//		int score = 87;
//		switch (score / 10) {
//		case 9:
//			System.out.println("����");
//			break;
//		case 8:
//			System.out.println("����");
//			break;
//		case 7:
//			System.out.println("��ǿ");
//			break;
//		case 6:
//			System.out.println("����");
//			break;
//		default:
//			System.out.println("fail");
//		}
//
////		ѭ��
//
//		for (int index = 1; index <= 10; index++) {
//			for (int i = 1; i <= 10; i++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//
//		int ii=10;
//		while(ii>1) {
//			System.out.println(ii);
//			ii--;
//		}
//		
//		int iii=0;
//		do {
//			System.out.println(iii);
//			iii--;
//		}while(iii>1);
		
		//�ж�һ�������Ƿ�Ϊ����
		//һ������  67
		int num=67;
		//������ ��ʼֵΪ0
		int count=0;		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++; //�ҵ������������� ��������1
			}
		}		
		if(count==0) {
			System.out.println(num+"������");
		}else {
			System.out.println(num+"��������");
		}
		
		//�ж�һ�������Ƿ�Ϊ����
		int num2=47;
		//��ʼ������
		boolean flagX=true;
		for(int i=2;i<num2;i++) {
			if(num2%i==0) {
				flagX=false; //�ҵ������������� ���عر�
			}
		}
		if(flagX) {
			System.out.println(num2+"Ϊ����");
		}else {
			System.out.println(num2+"��Ϊ����");
		}
		
		
//		1.����һ��ż�� n=20
//		2.��2��ʼѭ����n/2  2~10
//		3.��2~10��Ѱ������    �ҵ�3
//		4.�ж�n-�ҵ�������   �Ƿ�Ϊ����   20-3=17   17�Ƿ�Ϊ������
//		CSDN V2EX
//		�������Ա  ǧ��  ����
		
		int num3=88;
		for(int i=2;i<=num/2;i++) {
			boolean flag=true;
			for(int ii=2;ii<i;ii++) {
				if(i%ii==0) {
					flag=false;
					break;
				}
			}			 
			if(flag) {
				boolean flag2=true;
				for(int i3=2;i3<num-i;i3++) {
					if((num-i)%i3==0) {
						flag2=false;
						break;
					}
				}
				if(flag2) {
					System.out.println(i+","+(num-i));
				}
				
			}
		}
		
		
		
		
		
	}

	public boolean fun1(int num){
		//...
		return false;		
	}
}
