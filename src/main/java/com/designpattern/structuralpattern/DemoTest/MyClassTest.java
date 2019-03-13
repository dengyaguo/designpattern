package com.designpattern.structuralpattern.DemoTest;


import org.junit.Test;
import org.springframework.core.annotation.AnnotationUtils;

//编写测试代码
public class MyClassTest {

    @Test




    public void test1() throws NoSuchMethodException {
        try {
            MyAliasAnnotation aliasAnnotation = AnnotationUtils.findAnnotation(MyClass.class.getMethod("one"), MyAliasAnnotation.class);
            MyAliasAnnotation aliasAnnotation1 = AnnotationUtils.findAnnotation(MyClass.class, MyAliasAnnotation.class);
            MyAliasAnnotation01 aliasAnnotation2 = AnnotationUtils.findAnnotation(MyClass.class.getMethod("one2"), MyAliasAnnotation01.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();


        }

    }

}