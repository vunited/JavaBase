package com.singleton;
public class TestSingleton4 {

    /**
     * 构造方法私有化
     */
    private TestSingleton4(){
    }
    
    //静态内部类
    
    private static class SingleHolder{
        private static final TestSingleton4 ins = new TestSingleton4();//这里和饿汉模式一样
    }

    /**
     * 内部类方式获取单例
     * @return
     */
    public static TestSingleton4 getInstance(){
        return SingleHolder.ins;//返回刚刚创建的对象
    }
    
}