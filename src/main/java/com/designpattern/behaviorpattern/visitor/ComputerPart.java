package com.designpattern.behaviorpattern.visitor;

public interface ComputerPart {
    public void accept(Visitor computerPartVisitor);
}
