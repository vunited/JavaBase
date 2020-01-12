package com.test.oopDay03;

public class Dog extends Animal {
	private String hairColor;

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public Dog(String name, String hairColor) {
		super(name);
		this.hairColor = hairColor;
	}

	public Dog(String hairColor) {
		super();
		this.hairColor = hairColor;
	}

	public Dog() {
		super();
	}

	// 重写叫声
	@Override
	public void shout() {
		System.out.println(super.getName() + "旺旺叫，毛发颜色为" + this.getHairColor());
	}

	// 重写觅食
	@Override
	public void eat() {
		System.out.println("在啃骨头");
	}
	// 子类独有方法 看家护院
	public void guard() {
		System.out.println("在看家");
	}
}
