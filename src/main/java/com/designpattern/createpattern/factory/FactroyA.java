package com.designpattern.createpattern.factory;

public class FactroyA implements AbstractFactory {
    @Override
    public Object getInstance() {
        return new FactroyA();
    }
}
