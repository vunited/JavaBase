package com.test.javaBasic;

import java.util.Scanner;

public class JavaDay03 {
	public static void main(String[] args) {
//������ ʵ��ĳ���ض����ܵĴ���Ƭ��
//		�������ص㣺 ���븴�� ά���޸ķ���
//		�����ĸ�ʽ��
//		�ɼ���   ���δ�   ������������   ���������β��б�{
//			������
//		}
//		���÷�����  ��������ʵ���б�
//		int[] x = { 4, 5, 3 };
//		System.out.println(sumFunc(5, 7));
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println(maxInThree(a,b,c));
//		int[] arr={4,5,43,65,34};
//		System.out.println(maxInArrays(arr));

//System.out.println(maxInNums());
//System.out.println(maxInNums(4));
//System.out.println(maxInNums(5,23));
//System.out.println(maxInNums("erer"));

//		public static void demo01(int x) {
//			x=10;
//		}
//		public static void demo01(int[] x) {
//			x[0]=10;
//		}

//		int a = 1;
//		demo01(a); // demo01(1)
//		System.out.println(a);

		int[] arr = { 1, 1, 1, 1, 1, 1, 1 };
		demo01(arr);
		System.out.println(arr[0]);
		
		System.out.println(mulNum(11));
	}

	public static int demoPrint(int[] arr) {

		return arr.length;
	}

	// �������β�Ϊ�������ͱ���������ֵΪ���
	public static int sumFunc(int num1, int num2) {
		return num1 + num2;
	}

//case:1���һ�������������������ͱ����е����ֵ    �β�  �������ͱ���
	public static int maxInThree(int num1, int num2, int num3) {
		return ((num1 > num2) ? num1 : num2) > num3 ? ((num1 > num2) ? num1 : num2) : num3;
	}

//case��2���һ������������һ�������е����ֵ   �β�  һ����������
	public static int maxInArrays(int[] arr) {
		int max = arr[0];
		for (int eachNum : arr) {
			if (max < eachNum) {
				max = eachNum;
			}
		}
		return max;
	}

//		�ɼ��ԣ�
//		public :ͬһ��������࣬������࣬ͬһ����Ŀ�ﶼ�ɼ�
//		protected: ͬһ��������࣬��������� �ɼ�
//		(default): ͬһ��������� 
//		private:���Ե�ǰ��ɼ�
//      public protected (default) private  static void return 
//		���δʣ�
//		static: ��̬��
//		(default):��̬��
//		��ֻ̬�ܵ��þ�̬������

//		�����������ͣ�
//		void :�޷���ֵ

//		��������
//		����ĸСд �շ�ʽ����

//	    return��ʹ�ã�
//	      �з�����������ʱ��return ��������Ƿ���ֵ  ע�⣡���ص�ֵҪ�ͷ����������Ͷ�Ӧ
//	    �޷�����������ʱ��void����return��ʾ ������ǰ����

//	 �βΣ���ʽ����  ��������ʱ����������������  д����  ��������  ������	
//	ʵ�Σ�ʵ�����  ���÷���ʱ���������������� д����  ����ֵ	
//	�βΣ�ʵ�Σ� ˳�򣬺���������Ҫһ��

//	���������أ� ��������ͬ���βε����ͣ�������ͬ��!!!�ͷ��������޹�
	public static int maxInNums() {
		return 1;
	}

//	public static void maxInNums() {
//	}
	public static int maxInNums(int num1) {
		return 2;
	}

	public static int maxInNums(int num1, int num2) {
		return 3;
	}

	public static int maxInNums(String num1) {
		return 4;
	}

	// ֵ����
//	�����������ͣ� ���ݵ��� ��ʵ��ֵ
//	������������� ���ݵ���  ���������
	public static void demo01(int x) {
		x = 10;
	}

	public static void demo01(int[] x) {
		x[0] = 10;
	}

//	������ʹ�ü��ɣ��ݹ�  �����ڵ��������� 
//	5��   5*4*3*2*1   4!  4*3*2*1    5��==5*4��   1��==1
//  mulNum(1) ==  1
//	mulNum(n)  ==  n*mulNum(n-1) 
//	mulNum(1)
	public static int mulNum(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * mulNum(num - 1);		                                    
		}
	}
//	System.out.println(mulNum(11));
//	case:1 һ�����h�׸߶�׹�䣬��һ�η�����h/2���ڶ��η�������һ�ε�һ�롣
//	            �����n�Σ������ض�����
//	            public static int ballHight(int h,int n) {
//		
//	}
//	System.out.println(ballHight(10,3));
//	case��2 ��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ�����������
//	��ÿ�����ֿ�ʼ������.���㣬��n���� ��������Ϊ���١�
//	
//	case��3 һ���������ƣ�ÿ�α�����������ֵ����һ���ټ���1�㣬�Ժ�ÿ�α�������
//	����ֵ������(��ǰ����ֵ��һ���1��)������ʮ�α���������֮�󣬷���ֵֻʣ1�㣬
//	����������Ƴ�ʼֵΪ���١�

}
