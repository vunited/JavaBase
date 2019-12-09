package com.polymorphism;

import java.util.Random;

public class Shape {
	
	static RandomShapeGenerator ss;
//	enum Shapes{
//		CIRCLE,SQUARE,TRIANGLE;
//		    
//	}
	
	
	public void draw() {}
	public void easer() {}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s = new Shape[9];
		for(int i=0;i<s.length;i++)
		{
			s[i] = ss.next();
		}
		for (Shape shape : s) {
			shape.draw();
		}		
	}
	
public class RandomShapeGenerator{
		
		Random r = new Random(47);
		public Shape next() {
			switch(r.nextInt(3)){
				default:
				case 0:return new Circle();
				case 1:return new Shape();
				case 2:return new Triangle();
			}
			
			
				
			
			//return ;
		}
		
	}
class Circle extends Shape{
	public void draw() {System.out.println("画圆形");}
	public void easer() {System.out.println("删除圆形");}
}

class Square extends Shape{
	public void draw() {System.out.println("画方形");}
	public void easer() {System.out.println("删除方形");}
}

class Triangle extends Shape{
	public void draw() {System.out.println("画三角形");}
	public void easer() {System.out.println("删除三角形");}
}
}
