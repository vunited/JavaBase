package com.DesignPatternsand;

import java.util.*;
import java.util.stream.IntStream;


public class Car extends Vehicle implements IRepairable,ISellable {
	//负责封装Car逻辑
	//继承满足 开闭原则：模块、类、函数 应该对扩展开放，对修改关闭（设计模式基础）
	
	
	//继承父类的toString方法
	public Car(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("an vehicle");
		Vehicle v2 = new Car("a Car");
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		
		/**
		 * ArrayList：底层是基于动态数组，根据下表随机访问数组元素的效率高，
		 * 向数组尾部添加元素的效率高；但是，删除数组中的数据以及向数组中间添加数据效率低，因为需要移动数组。
		 */
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		/**
		 * LinkedList基于链表的动态数组，数据添加删除效率高，只需要改变指针指向即可
		 * 但是访问数据的平均效率低，需要对链表进行遍历。
		 */
		List<Integer> odds = new LinkedList<Integer>();
		for (int val : list) {
			if(val % 2 ==0) {
				odds.add(val);
			}
		}
		
		for (int val2 : odds) {
			System.out.println(val2);
		}
		
		//函数式编程 java8 开创
		IntStream.range(0, 10).filter(i -> i % 2 ==0 ).forEach(System.out::print);
		
	}

	public boolean lock(Key key) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean unlock(Key key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void pp() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void repair() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void sell() {
//		// TODO Auto-generated method stub
//		
//	}
}
