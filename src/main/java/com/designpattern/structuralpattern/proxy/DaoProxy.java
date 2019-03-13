package com.designpattern.structuralpattern.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DaoProxy implements MethodInterceptor {

    /**
     * Object表示要进行增强的对象
     * Method表示拦截的方法
     * Object[]数组表示参数列表，基本数据类型需要传入其包装类型，如int-->Integer、long-Long、double-->Double
     * MethodProxy表示对方法的代理，invokeSuper方法表示对被代理对象方法的调用
     */
    @Override
    public java.lang.Object intercept(java.lang.Object o, Method method, java.lang.Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before Method Invoke");
        String name = method.getName();
        if (name == "select") {
            methodProxy.invokeSuper(o, objects);
        }else{
            System.out.println("没有拦截");
        }
        System.out.println("After Method Invoke");

        return o;
    }
}
