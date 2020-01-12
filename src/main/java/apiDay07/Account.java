package com.test.apiDay07;

public class Account {
	private Integer count;

	public Account(Integer count) {
		super();
		this.count = count;
	}

	public /* synchronized *//* ������ */ void getMoney(int money) {
		synchronized (this) {  //������
			if (money <= count) {
				System.out.println("ԭ��" + count + "Ԫ");
				count -= money;
				System.out.println(Thread.currentThread().getName() + "ȡ��" + money + "Ԫ��ʣ��" + count + "Ԫ");
			} else {
				System.out.println("���㣬��ȡ" + money + "Ԫ��ԭ��" + count + "Ԫ");
				System.exit(0); // ����java����/�ر������
			}
		}
	}
}
