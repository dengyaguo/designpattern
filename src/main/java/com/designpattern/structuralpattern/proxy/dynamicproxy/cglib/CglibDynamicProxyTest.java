package com.designpattern.structuralpattern.proxy.dynamicproxy.cglib;

import com.designpattern.structuralpattern.proxy.dynamicproxy.jdk.Son;

public class CglibDynamicProxyTest {
    //测试cglib动态代理
    public static void main(String[] args) {

        CglibPerson cglibPerson  = (CglibPerson) new MyCglibDynamicProxy().getInstance(CglibPerson.class);
        cglibPerson.sayHello();

        Son son = (Son) new MyCglibDynamicProxy().getInstance(Son.class);//Son本身implements Person
        son.findJob();
    }
}
