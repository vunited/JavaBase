package com.polymorphism;

import com.polymorphism.MainClass.Instrument;
import com.polymorphism.MainClass.NOTE;

public class TestPolymorphism {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				MainClass mc = new MainClass();
				
				tune(mc);
	}

	

	public  void tune(Instrument i) {
		// TODO Auto-generated method stub
		i.play(NOTE.EASY);
	}

}
