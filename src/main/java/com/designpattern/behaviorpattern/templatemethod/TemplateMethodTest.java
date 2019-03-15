package com.designpattern.behaviorpattern.templatemethod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        ConcreteTemplateA concreteTemplateA = new ConcreteTemplateA();
        concreteTemplateA.templateMethod();
        ConcreteTemplateB concreteTemplateB = new ConcreteTemplateB();
        concreteTemplateB.templateMethod();
    }
}
