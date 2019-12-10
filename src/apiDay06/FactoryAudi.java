package com.test.apiDay06;

public class FactoryAudi implements FactoryInterface {

	@Override
	public Car produceCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}
