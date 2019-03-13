package com.designpattern.behaviorpattern.visitor;

public class ComputerPartDisplayVisitor implements Visitor {
    @Override
    public void visit(Visitor visitor) {
        System.out.println(visitor.getClass());
    }
}