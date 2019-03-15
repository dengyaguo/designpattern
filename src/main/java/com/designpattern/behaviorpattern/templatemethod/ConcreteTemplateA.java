package com.designpattern.behaviorpattern.templatemethod;

public class ConcreteTemplateA extends AbstractTemplate {
    @Override
    void operation1() {
        System.out.println("A 操作1");
    }

    @Override
    void operation2() {
        System.out.println("A 操作2");
    }
}
