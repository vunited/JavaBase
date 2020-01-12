package com.test.apiDay06;

public class AnimalDog implements AnimalInterface {

	@Override
	public Animal born() {
		// TODO Auto-generated method stub
		return new Dog();
	}

}
