package com.test.javaBasic;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaDay05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("�Ƿ�ʼ��ϷY/N");
//		Scanner sc = new Scanner(System.in);
//		String flag = sc.next();
//		if (flag.equals("Y") || "y".equals(flag)) { // equals()
//			System.out.println("Y");
//
//			boolean checkE = true;
//			while (checkE) {
//				Random rd = new Random();
//				int count = 0;
//				int[] fourNum = { rd.nextInt(9) + 1, rd.nextInt(10), rd.nextInt(10), rd.nextInt(10) };
//				for (int eachNum : fourNum) {
//					for (int eachNum2 : fourNum) {
//						if (eachNum == eachNum2) {
//							count++;
//						}
//					}
//				}
//				if (count == 4) {
//					System.out.println(Arrays.toString(fourNum));
//					checkE = false;
//				}
//			}
//		} else {
//			System.out.println("N");
//
//		}
		
		
		String[] pokers= {"����A","����A","��Ƭ10","��ƬJ","��ƬK"};
		Random random=new Random();
		int index=random.nextInt(5);
		System.out.println(pokers[index]);
		int index02=random.nextInt(5);
		
	}

}
