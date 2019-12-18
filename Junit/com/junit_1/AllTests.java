package com.junit_1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)//注释相应的运行器
@SuiteClasses({ ParameterizedTest.class, })//并且通过suiteClasses注释中制定测试类 
//多个之间用，分割
public class AllTests {

}
