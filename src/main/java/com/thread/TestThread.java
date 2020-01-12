package com.thread;

public class TestThread {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Teacher t = new Teacher("桑杰逊","12345","男","嵌入式");
		t.set("大连东软信息学院", "大四");
		Thread th1 = new Thread(t);
		
		Student s = new Student("张军","43215","男","计算机");
		s.set("大连东软信息学院", "大四");
		Thread th2 = new Thread(s);
		s.setStudentavg(150);//分
		
		//当前对象线程
		th1.setName("线程-1");
		
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(1000);
			System.out.println(th1.getName()+t.toString());
			System.out.println(th2.getName()+s.toString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
