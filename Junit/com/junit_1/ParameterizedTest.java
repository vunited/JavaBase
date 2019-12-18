package com.junit_1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import com.junit_1.Class_1_1.Calculator;

public class ParameterizedTest {
	
	private double expected;
	private double valueOne;
	private double valueTwo;
	
	@Parameters
	//玩玩集合 
	public static Collection<Integer[]> getTypeParmeters(){
		//返回一个二维数组
		return Arrays.asList(new Integer[][] {
			{2,1,1},{3,2,1},{4,3,1}
			
			
		});
	}
	//构造函数
	public ParameterizedTest(double expected,double valueOne,double valueTwo) {
		this.expected = expected;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}
	
	public ParameterizedTest() {
		//super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void sum() {
		Calculator calc = new Calculator();
		assertEquals(expected,calc.add(valueOne, valueTwo),0);
	}
	
	
	
	//@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	

}
