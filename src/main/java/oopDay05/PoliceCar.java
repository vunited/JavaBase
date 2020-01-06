package com.test.oopDay05;

public class PoliceCar extends AlarmCar {
	private String carColor;

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public PoliceCar(String carColor) {
		super();
		this.carColor = carColor;
	}

	public PoliceCar() {
		super();
	}

	public PoliceCar(String rego, String carColor) {
		super(rego);
		this.carColor = carColor;
	}

	@Override
	public void stop() {
		System.out.println("警车停着");
	}

	@Override
	public void noise() {
		// TODO Auto-generated method stub
		System.out.println("警车发出声音");
	}

	@Override
	public void silence() {
		// TODO Auto-generated method stub
		System.out.println("警车没有发出声音");

	}

}
