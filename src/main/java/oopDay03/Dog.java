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

	// ��д����
	@Override
	public void shout() {
		System.out.println(super.getName() + "�����У�ë����ɫΪ" + this.getHairColor());
	}

	// ��д��ʳ
	@Override
	public void eat() {
		System.out.println("�ڿй�ͷ");
	}
	// ������з��� ���һ�Ժ
	public void guard() {
		System.out.println("�ڿ���");
	}
}
