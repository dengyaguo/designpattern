package com.designpattern.structuralpattern.decorator;

public   class Decorator implements  Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void method() {
        System.out.println("before method,Decorator doing ");
        component.method();
        System.out.println("after method ,Decorator doing");
    }

}
