package com.designpattern.behaviorpattern.visitor;

public class ConcreteElementTwo extends Element{

    public ConcreteElementTwo() {
    }
    @Override
    void accept(Visitor visitor) {
        visitor.visitB(this);
    }
}
