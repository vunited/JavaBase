package com.test.oopDay01;

public class Company {
	String cid; // 公司ID
	String name; // 公司名
	Member[] memlist = new Member[5]; // 职员们 Member类型的数组
	int index;   //memlist数组下标

	public Company() {

	}

	public Company(String _cid, String _name, Member[] _memlist, int _index) {
		cid = _cid;
		name = _name;
		memlist = _memlist;
		index = _index;
	}

	public Company(String _cid, String _name) {
		cid = _cid;
		name = _name;
	}

	// 行为：动态方法 添加一个员工到该公司
//	通过方法，把一个Member类的对象，添加到一个Company类对象的成员变量--Member类型数组当中
	public boolean addMem(Member mem) {
		if (index < memlist.length) {
			memlist[index] = mem; // memlist[0]=mem
			index++;
			return true;
		} else {
			System.out.println("员工人数已满5人，添加失败");
			return false;
		}
	}

	public void show() {
		System.out.println(cid + "," + name);
		for (Member mm : memlist) {
			if (mm != null) {
				mm.show();
			}
		}
	}
}
