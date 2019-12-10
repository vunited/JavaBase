package com.test.oopDay06;

public class Animal {
	public String noise() {
		return "peep";
	}

	public static void main(String[] args) {
		Cat cat = null;
		Animal animal = new Dog();
		if (animal instanceof Cat) {
			cat = (Cat) animal;
			System.out.println(cat.noise());
		} else {
			System.out.println("animal is not Cat's instance");
		}
	}
}

class Dog extends Animal {
	public String noise() {
		return "bark";
	}
}

class Cat extends Animal {
	public String noise() {
		return "meow";
	}
}