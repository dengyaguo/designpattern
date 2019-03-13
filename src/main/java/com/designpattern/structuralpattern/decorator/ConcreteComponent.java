package com.designpattern.structuralpattern.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void method() {
        System.out.println("this is old method");
    }
}
