package com.designpattern.createpattern.factory;

public class FactroyB implements AbstractFactory {
    @Override
    public Object getInstance() {
        return new FactroyB();
    }
}
