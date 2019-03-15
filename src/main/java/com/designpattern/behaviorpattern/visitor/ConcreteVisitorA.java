package com.designpattern.behaviorpattern.visitor;

public class ConcreteVisitorA implements Visitor{
    @Override
    public void visitA(Element element) {
        System.out.println("元素："+element.getClass());
    }
    @Override
    public void visitB(Element element) {
        System.out.println("元素："+element.getClass());
    }
}
