package com.test.oopDay05;

import java.util.Random;

public class OopDay05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlarmCar ac1 = new FireEngine();
		AlarmCar ac2 = new PoliceCar();
		AlarmCar ac3 = new FireEngine();
		AlarmCar[] acs = { ac1, ac2, ac3 };
		for (AlarmCar acx : acs) {
			acx.stop();
		}
		FireEngine fe1 = (FireEngine) ac3;

//		���� �ؼ���  abstract  ������� �������̳�
//		������������  ��  ����

//		������ ��  ������
//		1.����ʵ����
//		2.�й��췽��������ʵ����ʱ��Ҫ
//		3.�������� ����û�г��󷽷� �� �г��󷽷����� �����ǳ�����

//		���η�����  ���󷽷�
//		1.û�з�����
//		2.�����ڷǳ���ĺ������ ����д����ʵ�֣�

//		AlarmCar ac4=new AlarmCar();

//		�ӿڣ�һ�ֳ������ͣ��ǳ���ķ����ļ��ϣ�������interface
//		�ӿ� ������ʵ�ֵ�  implements

//		1.�ӿ���ķ��� Ĭ�� public abstract
//		2.�ӿڲ�������ʵ��������
//		3.�ӿ�û�й��췽��
//		4.�ӿ������з���������Ϊ���󷽷�
//		5.�ӿ���û�г�Ա����
//		6.�ӿڲ��Ǳ��̳У����Ǳ�ʵ��
//		7.�ӿ�֧�ֶ�ʵ��----һ�������ʵ�ֶ���ӿڣ�һ���ӿڿ��Ա������ʵ��
//		8.�ӿ�֧�ֶ�̳�

		AlarmSound01 as01 = new PoliceCar(); // �ӿڻص� �ӿ����ͣ�ʵ����ʵ������󣬸ö���ɵ��ýӿ��з���
		AlarmSound02 as02 = new FireEngine();
		as01.noise();
		as02.silence();
		
		
//		java.lang   java.util
		Random rd=new Random();
		
		for(int i=1;i<=5;i++) {
			System.out.print(rd.nextInt(10));
		}
		
		rd.nextInt();
		
		rd.nextBoolean();
		
		rd.nextFloat();
		
		rd.nextDouble();
		
		rd.nextLong();
		
		rd.getClass();
		
//		foo  bar  foobar baz   qux  === fubar : fucked up beyond any recognization
		
	}

}
