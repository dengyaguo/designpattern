package com.designpattern.structuralpattern.proxy;

public class ObjectImpl implements Object {
    @Override
    public void action() {
        System.out.println("被代理的实例");
    }
}
