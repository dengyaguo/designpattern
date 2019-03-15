package com.designpattern.behaviorpattern.visitor;

/**
 * @author Administrator
 */
public class ConcreteElementOne extends Element{
    public ConcreteElementOne() {
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitA(this);
    }
}
