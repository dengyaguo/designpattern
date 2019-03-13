package com.designpattern.structuralpattern.DemoTest;

//编写测试类
@MyAliasAnnotation(location = "这是值")
public class MyClass {

    @MyAliasAnnotation(location = "这是值")
    public static void one(){
    }

    @MyAliasAnnotation(value = "hehe")
    public static void one2(){
    }
}

