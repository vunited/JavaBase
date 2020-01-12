package com.polymorphism;



public class MainClass extends SunClass {
	 
	
	
	public static void main(String[] args) {
		SupperClass st= (SupperClass) new SunClass();//拿到儿子对象 
		//st 能调用 父类和子类 方法
		st.print_not();
		st.print();//静态类 不被重写
		
		
		//不能跨类访问父类
		st.open();
		//st.close();
	}
	
//	enum NOTE{
//			MID,HIGH,EASY;
//		}
//		
//		
//		void play(){
//			
//		}
//		
//		class Instrument{
//			
//			public void play(NOTE n) {
//				System.out.println(""+n);
//			}
//		}
}
