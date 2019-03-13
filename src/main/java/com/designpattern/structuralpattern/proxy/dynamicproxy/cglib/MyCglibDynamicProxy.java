package com.designpattern.structuralpattern.proxy.dynamicproxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public  class MyCglibDynamicProxy implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("方法前拦截");
        methodProxy.invokeSuper(o,objects);
        System.out.println("方法后拦截");
        return o;
    }
}
