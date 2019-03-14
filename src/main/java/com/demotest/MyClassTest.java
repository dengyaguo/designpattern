package com.demotest;


import org.junit.Test;
import org.springframework.core.annotation.AnnotationUtils;

//编写测试代码
public class MyClassTest {
    @Test
    public void test1() throws NoSuchMethodException {
        try {
            MyAliasAnnotation01 classAliasAnnotion = AnnotationUtils.findAnnotation(MyClass.class, MyAliasAnnotation01.class);
            MyAliasAnnotation01 aliasAnnotation = AnnotationUtils.findAnnotation(MyClass.class.getMethod("one"), MyAliasAnnotation01.class);
            MyAliasAnnotation02 aliasAnnotation2 = AnnotationUtils.findAnnotation(MyClass.class.getMethod("one2"), MyAliasAnnotation02.class);
            System.out.println("location:"+aliasAnnotation.location()+"value:"+aliasAnnotation.value());
            System.out.println("location:"+classAliasAnnotion.location()+"value:"+classAliasAnnotion.value());
            System.out.println("location:"+aliasAnnotation2.location()+"value:"+aliasAnnotation2.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}