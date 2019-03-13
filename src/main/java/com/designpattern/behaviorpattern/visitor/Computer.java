package com.designpattern.behaviorpattern.visitor;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(visitor);
        }
    }
}