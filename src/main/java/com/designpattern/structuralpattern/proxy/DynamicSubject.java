package com.designpattern.structuralpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler {

    private SubjectImpl subject;
    private testObject test;
    public DynamicSubject() {}

    public DynamicSubject(SubjectImpl obj) {
        subject = obj;
    }
    public DynamicSubject(testObject obj) {
        test = obj;
    }

    @Override
    public java.lang.Object invoke(java.lang.Object proxy, Method method, java.lang.Object[] args) throws Throwable {
        System.out.println( " before calling "  + method);
        method.invoke(subject,args);
        System.out.println( " after calling "  + method);
        return null;
    }
}
