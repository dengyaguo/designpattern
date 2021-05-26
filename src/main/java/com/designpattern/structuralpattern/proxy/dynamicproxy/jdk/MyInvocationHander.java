package com.designpattern.structuralpattern.proxy.dynamicproxy.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHander implements InvocationHandler {
    private Person person;
    public Object getInstance(Person target){
        this.person = target;
      //  ObjectV o = Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);

        //自定义MyProxy和MyClassLoader类模拟jdk动态生成字节码的过程
        Object o = MyProxy.newProxyInstance(new MyClassLoader(), target.getClass().getInterfaces(), this);
        return o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("找对象前 建议");
        method.invoke(person,args);
        System.out.println("找到对象后 审核");
        return null;
    }
}
