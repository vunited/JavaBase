package com.test.javaBasic;

import java.util.Arrays;

public class JavaDay02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		case��
//		����10000Ԫ�������У���������ǧ��֮����ÿ�����ʱ��
//		��Ϣ�ͱ���ϼ�Ϊ��һ��ı�������󣬱�������
//		int money=10000;
//		for(int year=0;year<=4;year++) {
////			money=money*0.003+money;
////			money=money*(0.003+1);			
//			money*=(1+0.003);
//		}
//		System.out.println("����󱾽�ϼ�Ϊ"+money+"Ԫ");

//		���飺�����ͬ�������͵�����/���� Arrays
//		��������   ��ʽ�� 1.��������[] ������    2.��������  ������[]
//		int[] arr;   //�Ƽ�ʹ�ô���
//		int arr02[];

//		����һ��
//		byte[] arr = new byte[5];
//		arr[0] = 2;
//		arr[1] = 32;
//		arr[2] = 25;
//		arr[3] = 45;
//		arr[4] = 76;
//
//		����������� ����ֵ Ĭ��  0   0.0   false   ''  null
//		String[] arr = new String[5];
//		System.out.println(Arrays.toString(arr));
////		��������
//		int[] arr02 = new int[] { 23, 87, 43, 4346 };
//
////	    ��������
//		int[] arr03 = { 23, 87, 43, 4346 };

//		�������ͨ���±� ��Ԫ�ؽ��з���(��0��ʼ)
//		System.out.println(arr02[2]);
//		
////		����ĳ��� ����ͨ��length���Ի�ȡ
//		System.out.println(arr03.length);

//		����ı���
//		����һ�������±꣺
//		int[] scores= {99,96,76,35,57,87};
//		for(int index=0;index<scores.length;index++) {
//			System.out.println(scores[index]); 
//		}
//	    ��������for-each����
//		for(int xx:scores) {
//			System.out.print(xx+",");
//		}

//		����̨�������
//		ֱ����� ������ �������  ����ĵ�ַ
//		System.out.println(scores);
////		����������ת��ΪString�ַ������
//		System.out.println(Arrays.toString(scores));

//		case1:
//			1.��������  4��3��5��9��8
//			2.��ȡ 3  9   �±�
//			3.���������� 3  9  λ��

//		1
//		int[] arr= {4,3,5,9,8};  //��������
////		2
//		int index3=0;   //��ʼ������ ׼�����±�ֵ
//		int index9=0;
//		for(int index=0;index<arr.length;index++) { //ѭ����������
//			if(arr[index]==3) { //�ж�����Ԫ���Ƿ�Ϊ3 ����� �򱣴浱ǰ�±�
//				index3=index;
//			}
//			if(arr[index]==9) {
//				index9=index;
//			}
//		}
//		System.out.println(index3+","+index9);
////		3
//		int temp=arr[index3]; //������ʱ���� ��������ֵ
//		arr[index3]=arr[index9];
//		arr[index9]=temp;
//		System.out.println(Arrays.toString(arr));

//		case2: ����̨��� arr���� ��brr��û�е�Ԫ��
//		tips: ����arr�� ÿһ��Ԫ�� ��brr������Ԫ�ؽ��бȽ�
//			int[] arr= {1,4,2,5,6,3};
//			int[] brr= {4,5,6,7,9,8};
//			
//
//			for(int arrEach:arr) {  //����arr����
//				boolean flag=true;   //��ʼ������ ���ؿ���
//				for(int brrEach:brr) {    //����brr����
//					if(arrEach==brrEach) {  //�ж�arr��ĳ��Ԫ�� ��brr��ÿ��Ԫ���Ƿ���ͬ
//						flag=false;         //����ҵ���ͬ  �򿪹عر�
//						break;              //���عرպ� ��ֹbrr����ѭ��
//					}				
//				}	
//				if(flag) {                  //�жϿ���״̬  ���� �����
//					System.out.println(arrEach);
//				}				
//			}
//			
//		case3: 
//		int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 2, 2, 2 };
//			1.arr�����Ԫ��ֵ
//			2.arr��3���ֵĴ���
//			3.����չ��arr�� ���ִ�������Ԫ��

//			1.
//			int max=arr[0];
//			for(int index=0;index<arr.length;index++) {
//				if(max<arr[index]) {
//					max=arr[index];
//				}
//			}
//			System.out.println(max);

//			2.
//			int count3=0;
//			for(int arrEach:arr) {
//				if(arrEach==3) {
//					count3++;
//				}
//			}
//			System.out.println(count3);
//			3.
//		int countMax = 0; // �����ִ���
//		int maxValue = arr[0]; // �����ִ�����Ӧ��Ԫ��ֵ
//		for (int i = 0; i < arr.length; i++) {
//			int count = 0;
//			for (int ii = 0; ii < arr.length; ii++) {
//				if (arr[i] == arr[ii]) {
//					count++;
//				}
//			}
//			if (countMax < count) {
//				countMax = count;
//				maxValue = arr[i];
//			}
//		}
//		System.out.println(countMax);
//		System.out.println(maxValue);
		
//��ά���飺������ΪԪ�ص�����
//		int[][] twoDimArr = new int[3][2];
//		twoDimArr[0][0]=98;
//		twoDimArr[0][1]=76;
//		twoDimArr[1][0]=34;
//		twoDimArr[1][1]=87;
//		twoDimArr[2][0]=63;
//		twoDimArr[2][1]=6;
//		
//		int[][] twoDimArr02=new int[][]{{3,2},{5,6,3,24,53},{8}};
//		int[][] twoDimArr03={{3,2},{5,6,3,24,53},{8}};
//		
////		��ά��������
//		System.out.println(Arrays.deepToString(twoDimArr02));
//		System.out.println(twoDimArr03[1].length);
//		System.out.println(Arrays.toString(twoDimArr03[0]));
		
		
//		case:
//			������ �����ųɼ����£�  
//			A:50  60   55
//			B:60  60   58
//			C:78  96   85
//			1.�����ܳɼ�     total   sum   
//			2.�ܳɼ���߷�      max    min      avg       count  add   minus    
//			3.ƽ���ɼ���߷�
		int scoreSum=0;  //�����ܳɼ�
		int scoreMax=0;   //��߷ֱ���
		int avgMax=0;     //���ƽ���ֱ���
		int[][] arr= {{50,60,55},{60,60,58},{78,96,85}};
		for(int index=0;index<arr.length;index++) {  //����������
			scoreSum=0;   //�ܳɼ���ʼ��  ����
			for(int indexD=0;indexD<arr[index].length;indexD++) {   //�ڲ��������
				scoreSum+=arr[index][indexD];
			}
			System.out.println(scoreSum+","+scoreSum/arr[index].length);   //���ÿ���˵��ܳɼ���ƽ����
			
			if(scoreMax<scoreSum) {  //������ܳɼ�
				scoreMax=scoreSum;
			}
			if(avgMax<scoreSum/arr[index].length) {  //�����ƽ����
				avgMax=scoreSum/arr[index].length;
			}
			
		}
		System.out.println(scoreMax);
		System.out.println(avgMax);
			
	}
}
