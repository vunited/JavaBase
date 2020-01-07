package com.test.apiDay06;

public class Player {
	private String name;
	private Integer level;
	private static Player vip;
	
	//˽�л� �в� �޲ι��췽��
	private Player() {
		super();
	}

	private Player(String name, Integer level) {
		super();
		this.name = name;
		this.level = level;
	}

	//˽�л� set get����
	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private Integer getLevel() {
		return level;
	}

	private void setLevel(Integer level) {
		this.level = level;
	}

	public static Player getVip() {
		if(vip==null) {
			vip=new Player("СϺ��",1);
		} 
		return vip;
	}

	private static void setVip(Player vip) {
		Player.vip = vip;
	}
	
	//ʵ������
	public void fight() {
		System.out.println(name+"������");
	}
	public void levelUp() {
		vip.setLevel(vip.getLevel()+1);
		System.out.println(name+"������");
	}
	public void show() {
		System.out.println(name+"����"+level+"����");
	}
	
	
	
}
