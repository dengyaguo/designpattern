package com.designpattern.structuralpattern.proxy;

public class ProxyObject implements Object{
    private Object obj;

    public ProxyObject( ) {
        this.obj = new ObjectImpl();
    }
    @Override
    public void action() {
        System.out.println("-----代理开始-----");
        obj.action();
        System.out.println("-----代理结束-----");
    }
}
