package com.designpattern.behaviorpattern.visitor;

public class Keyboard  implements ComputerPart,Visitor {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void visit(Visitor visitor) {
        System.out.println(visitor.getClass());
    }
}
