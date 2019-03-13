package com.designpattern.structuralpattern.proxy.dynamicproxy.jdk;


public class JdkDynamicProxyTest {
    //jdk动态代理测试
    public static void main(String[] args) {
        Son son = new Son();
        Person person = (Person)new MyInvocationHander().getInstance(son);
        person.findLove();
    }
}
