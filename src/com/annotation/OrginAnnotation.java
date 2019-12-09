package com.annotation;

import static java.lang.annotation.ElementType.*;//静态导入

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({FIELD,METHOD,CONSTRUCTOR})//描述当前这个注解可以放置在哪里写的
//描述当前这个注解存在在哪个作用域中：源代码-（source）--编译---字节码（class）---加载---内存执行（runtime）
@Retention(RetentionPolicy.RUNTIME)//定义在内存中，定义域
@Inherited

public @interface OrginAnnotation {
	
	//仿照接口默认属性，写法 public static final String test = "test";
//	String test = "test";
	//默认方法写法 公有的抽象方法 public abstract test1()
//	String test1();//方法 传入参数 给别人
//	int test2();//有两个方法的时候传入参数必须带“方法名=值”
	
	String[] value();
	//String[] value() default "桑杰逊";默认传参，此时自定义注解中不带参数
}
