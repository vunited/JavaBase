package com.test.apiDay06;

public class Player {
	private String name;
	private Integer level;
	private static Player vip;
	
	//私有化 有参 无参构造方法
	private Player() {
		super();
	}

	private Player(String name, Integer level) {
		super();
		this.name = name;
		this.level = level;
	}

	//私有化 set get方法
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
			vip=new Player("小虾米",1);
		} 
		return vip;
	}

	private static void setVip(Player vip) {
		Player.vip = vip;
	}
	
	//实例方法
	public void fight() {
		System.out.println(name+"在练级");
	}
	public void levelUp() {
		vip.setLevel(vip.getLevel()+1);
		System.out.println(name+"升级啦");
	}
	public void show() {
		System.out.println(name+"现在"+level+"级了");
	}
	
	
	
}
