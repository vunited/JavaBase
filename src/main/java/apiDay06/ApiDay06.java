package com.test.apiDay06;

public class ApiDay06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//���ģʽ
		
//		����ģʽ(singleton)��ʼ�ձ�֤�ڶ��У�ֻ��һ��ʵ������Լ���ڴ�
		
		Single a=Single.getInstance();
		Single b=Single.getInstance();
		System.out.println(a==b);
		System.out.println(SingleLazy.getInstance()==SingleLazy.getInstance());
		
		Player.getVip().fight();
		Player.getVip().levelUp();
		Player.getVip().show();
		Player.getVip().levelUp();
		Player.getVip().show();
		
		
//		����ģʽ��factory��: ���ھ� �����
		
		//��ͨ����ģʽ
//		�ŵ㣺���ݲ�ͬ���� ��ƹ���������Ӧ�Ķ���
//		ȱ�㣺���ݵĲ���������ԣ��޷�������Ӧʵ��
//		��ʽ��
//		public ��Ʒ���๲ͬ�ӿ� ������(String ��Ʒ��������) {
//			if(��Ʒ��������.equalsIgnoreCase(���)) {
//				return new ��Ӧ����
//			}
//			if(��Ʒ��������.equalsIgnoreCase(���)) {
//				return new ��Ӧ����
//			}
//			...
//			return null
//		}
		
		
//		Factory factory=new Factory();
//		Car car=factory.produce("AU");  //new Audi()
//		car.start();
//		factory.produce("benZ").start();
//		
////		�����������ģʽ
////		�ŵ㣺������������ɼ� ����֪����ö�Ӧ��������ʵ������Ӧ����
////		ȱ�㣺�����ǷǾ�̬�� ��Ҫʵ�����������ܵ���
//		Car car02=factory.produceAudi();
//		Car car03=factory.produceBenz();
//		car02.start();
//		car03.start();
//		
////		��̬��������ģʽ
////		�ŵ㣺����ʵ�������� ��ֱ�ӵ���
////		ȱ�㣺��������������ʱ����Ҫ�Ķ�Factory��
//		Car car04=Factory.produceStaitcAudi();
//		car04.start();
		
//		���󹤳�����ģʽ
//		�ŵ㣺������Ʒʱ��ֻ���½�һ������ʵ���ࣨ�²�Ʒ��ʵ�ֹ����ӿڼ��ɣ���Ӱ��ԭ�д���
		FactoryInterface fif=new FactoryAudi();
		Car car05=fif.produceCar();//  Car car05=new Audi();
		car05.start();
		FactoryInterface fifM=new FactoryMazda();
		Car car06=fifM.produceCar();
		car06.start();
		
//		case:���ó��󹤳�����ģʽ
//			�ӿ�   AnimalInterface  ��Ϊ�����ӿ�
//			�ӿ�   Animal ��Ϊ ����ӿ�  ���г��󷽷� call()
//			ʵ����    Cat   Dog    
			AnimalInterface ai=new AnimalCat();
			Animal ani01=ai.born();
			ani01.call();
			
//		�ڲ��ࣺ����Ƕ����һ���ࡣ���������ⲿ�࣬�ڲ�������ڲ���
//		��̬�ڲ��ࣨ�����в��ã�
//		�Ǿ�̬�ڲ���(��Ա�ڲ���  �����ڲ���  ������!)
//		    �����ࣺ �ӿ�ʽ������   �̳�ʽ������  ���������� ������ע��"��"��β
//			�ӿ�ʽ������
			Car byd=new Car() {
				@Override
				public void start() {
					System.out.println("���ǵ�����");
				}
			};
			byd.start();
//			�̳�ʽ������ ������
			Fruit apple=new Fruit() {
				@Override
				public void type() {
					// TODO Auto-generated method stub
					System.out.println("ƻ���ó�");
				}				
			};
			apple.type();
//			����������
			Fruit.test(new Fruit() {
				@Override
				public void type() {
					// TODO Auto-generated method stub
					System.out.println("!!!");
				}				
			});
			
			
	}

}
