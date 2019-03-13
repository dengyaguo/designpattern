package com.designpattern.structuralpattern.proxy.dynamicproxy.jdk;

public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子 要求：白富美");
    }

    @Override
    public void findJob() {
        System.out.println("工资高，轻松的活");
    }
}
