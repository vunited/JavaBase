package com.test.oopDay06;

public class Member {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	//��д���hashcodeֵ ���ٸ��������ַ���ɣ� �����ݶ���ĳ�Ա����ֵ����
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}




	
	
//	hashCode ��ϣֵ ��ϣ�� ɢ��ֵ
//	���ݶ���������ַ!!! ͨ��һ���㷨 ���ɵ� һ������
//	����ϣֵ��ͬ�� һ������ͬһ������
//	����ϣֵ��ͬ�� ������ͬһ������
	
//	Set���� ȥ�� �������A  �ٷ������B �Ƚ�AB hashcode���粻ͬ����BҲ���뼯����
//	��������C  �Ƚ� A B  C hashcode  ���AC hashcode��ͬ�ˣ� �����Ƚ� A C equals
//	���� hashcode ��ѭԭ��  equals��ͬ hashcode����ͬ
//	@Override
//	public boolean equals(Object obj) {
//		Member other=(Member)obj;
//		if(age!=other.age) {
//			return false;
//		}
//		if(name!=other.name) {
//			return false;
//		}		
//		return true;
//		
//	}
	
	

}
