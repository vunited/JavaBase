package com.test.oopDay01;

public class Cube {
	//���ԣ�ȫ�ֱ���
	double length; // �߳�
//�вι���
	public Cube(double _length) {
         length=_length;
	}
	//�޲ι���
	public Cube() {
		
	}
//	��Ϊ����̬����  //���
	public double area() {
		return length*length;
	}
	public double totalLength() {
		return length*4;
	}
}
