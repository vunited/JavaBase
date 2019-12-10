package com.test.apiDay07;

public class Customer extends Thread {
	private Account acc;
	private Integer money;

	public Customer(Account acc, Integer money) {
		super();
		this.acc = acc;
		this.money = money;
	}

	@Override
	public void run() {		
		while(true) {
			acc.getMoney(money);
		}
	}
	
	public static void main(String[] args) {
		Account acc=new Account(1000);
		
		Customer c1=new Customer(acc,100);
		Customer c2=new Customer(acc,200);
		c1.start();
		c2.start();
		
	}
	
}
