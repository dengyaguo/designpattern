package com.designpattern.structuralpattern.DemoTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@MainBean(beanName = "mainbean")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        String[] beanNamesForType = context.getBeanNamesForType(Main.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
}
