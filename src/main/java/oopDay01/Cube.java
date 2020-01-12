package com.test.oopDay01;

public class Cube {
	//属性：全局变量
	double length; // 边长
//有参构造
	public Cube(double _length) {
         length=_length;
	}
	//无参构造
	public Cube() {
		
	}
//	行为：动态方法  //面积
	public double area() {
		return length*length;
	}
	public double totalLength() {
		return length*4;
	}
}
