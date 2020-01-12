package com.test.apiDay06;

public class Single {
	//����ģʽ������ʽ
//	������ʱ��ʵ��������
	//˽�о�̬��Ա���� ͬʱ ʵ����һ������
	private static Single instance=new Single();	
	//˽�л����췽��
	private Single() {
		
	}	
	//��̬���� Ȩ��һ��Ҫ����private
	public static Single getInstance() {
		return instance;
	}
}
class SingleLazy{
	//����ģʽ������ʽ
//	�����ʱ����ʵ������ֻ���ڵ���get����ʱ���ж��Ƿ�Ϊnullʱ��ʵ����
	//˽�о�̬��Ա���� 
	private static SingleLazy instance;
	//˽�л����췽��
	private SingleLazy() {
		
	}
	//��̬���� Ȩ��һ��Ҫ����private
	public static SingleLazy getInstance() {
		if(instance==null) {
			instance=new SingleLazy();
		}
		return instance;
	}
}

