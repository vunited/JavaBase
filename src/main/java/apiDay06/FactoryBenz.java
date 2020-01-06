package com.test.apiDay06;

public class FactoryBenz implements FactoryInterface {

	@Override
	public Car produceCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}
