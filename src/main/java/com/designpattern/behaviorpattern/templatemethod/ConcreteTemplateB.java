package com.designpattern.behaviorpattern.templatemethod;

public class ConcreteTemplateB extends AbstractTemplate {
    @Override
    void operation1() {
        System.out.println("B 操作1");
    }

    @Override
    void operation2() {
        System.out.println("B 操作2");
    }

    @Override
    void operation3() {

    }
}
