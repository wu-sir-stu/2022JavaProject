package com.example.java;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testSayHello() {
        Main helloWorld = new Main();
        String result = helloWorld.sayHello();

        // Assert.assertEquals() 及其重载方法功能:
        // 1. 如果两者一致, 程序继续往下运行.
        // 2. 如果两者不一致, 则中断测试方法,同时抛出异常信息 AssertionFailedError.
        assertEquals("Hello World", result);
        System.out.println("测试通过");
    }
}