package com.test.apiDay07;

public class Account {
	private Integer count;

	public Account(Integer count) {
		super();
		this.count = count;
	}

	public /* synchronized *//* 方法锁 */ void getMoney(int money) {
		synchronized (this) {  //代码锁
			if (money <= count) {
				System.out.println("原有" + count + "元");
				count -= money;
				System.out.println(Thread.currentThread().getName() + "取了" + money + "元，剩余" + count + "元");
			} else {
				System.out.println("余额不足，想取" + money + "元，原有" + count + "元");
				System.exit(0); // 结束java运行/关闭虚拟机
			}
		}
	}
}
