package com.demotest;

//编写测试类
@MyAliasAnnotation01(location = "annotation 01 值")
public class MyClass {

    @MyAliasAnnotation01(location = "annotation 01 值")
    public static void one(){
    }

    @MyAliasAnnotation02(value = "annotation 02 值")
    public static void one2(){
    }
}

