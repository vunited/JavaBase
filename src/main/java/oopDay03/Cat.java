package com.test.oopDay03;

public class Cat extends Animal {
	private String eyeColor; // 成员变量 眼珠颜色

//set get方法
	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

//构造方法
	public Cat(String name, String eyeColor) {
		super(name);
		this.eyeColor = eyeColor;
	}

	public Cat(String eyeColor) {
		super();
		this.eyeColor = eyeColor;
	}

	public Cat() {
		super();
	}

	// 重写叫声
	@Override
	public void shout() {
		System.out.println(super.getName() + "喵喵叫，瞳孔颜色为" + this.getEyeColor());
	}

	// 重写觅食
	@Override
	public void eat() {
		System.out.println("在吃鱼");
	}

	// 子类独有方法 抓老鼠
	public void catchMouse() {
		System.out.println("在抓老鼠");
	}

}
