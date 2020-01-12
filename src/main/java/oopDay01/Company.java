package com.test.oopDay01;

public class Company {
	String cid; // ��˾ID
	String name; // ��˾��
	Member[] memlist = new Member[5]; // ְԱ�� Member���͵�����
	int index;   //memlist�����±�

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

	// ��Ϊ����̬���� ���һ��Ա�����ù�˾
//	ͨ����������һ��Member��Ķ�����ӵ�һ��Company�����ĳ�Ա����--Member�������鵱��
	public boolean addMem(Member mem) {
		if (index < memlist.length) {
			memlist[index] = mem; // memlist[0]=mem
			index++;
			return true;
		} else {
			System.out.println("Ա����������5�ˣ����ʧ��");
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
