package com.test.oopDay05;

public abstract class AlarmCar implements AlarmSound{
	private String rego;

	public String getRego() {
		return rego;
	}

	public void setRego(String rego) {
		this.rego = rego;
	}

	public AlarmCar(String rego) {
		super();
		this.rego = rego;
	}

	public AlarmCar() {
		super();
	}

	//实例方法
	public void stop() {
		System.out.println("该功能车辆停着");
	}	
	
}
