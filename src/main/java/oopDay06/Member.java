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
	//重写后的hashcode值 不再根据物理地址生成， 而根据对象的成员变量值生成
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




	
	
//	hashCode 哈希值 哈希码 散列值
//	根据对象的物理地址!!! 通过一定算法 生成的 一组数字
//	（哈希值不同的 一定不是同一个对象）
//	（哈希值相同的 可能是同一个对象）
	
//	Set集合 去重 放入对象A  再放入对象B 比较AB hashcode，如不同，则B也放入集合中
//	想放入对象C  比较 A B  C hashcode  如果AC hashcode相同了， 继续比较 A C equals
//	所以 hashcode 遵循原则  equals相同 hashcode必相同
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
