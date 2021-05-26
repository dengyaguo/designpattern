package com.designpattern.structuralpattern.proxy;

public class testObject implements ObjectV {
    @Override
    public void action() {
        System.out.println("{测试}--0-被代理的实例");
    }
}
