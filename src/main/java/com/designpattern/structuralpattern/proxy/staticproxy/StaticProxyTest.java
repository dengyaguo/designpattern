package com.designpattern.structuralpattern.proxy.staticproxy;

public class StaticProxyTest {
    //静态代理
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
        System.out.println("----------------------------黄金分割线------------------------------");
        father.findJob();
    }
}
