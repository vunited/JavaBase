package com.DesignPatternsand;

public class Assistant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	void checkKey(Car car,Key key) {
	if(car.lock(key) == false ) {
		System.out.println("alert! worng key");
	}
	}
	
}
