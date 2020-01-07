package com.test.oopDay03;

public class Cat extends Animal {
	private String eyeColor; // ��Ա���� ������ɫ

//set get����
	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

//���췽��
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

	// ��д����
	@Override
	public void shout() {
		System.out.println(super.getName() + "�����У�ͫ����ɫΪ" + this.getEyeColor());
	}

	// ��д��ʳ
	@Override
	public void eat() {
		System.out.println("�ڳ���");
	}

	// ������з��� ץ����
	public void catchMouse() {
		System.out.println("��ץ����");
	}

}
