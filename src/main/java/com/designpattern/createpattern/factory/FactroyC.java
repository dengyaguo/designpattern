package com.designpattern.createpattern.factory;

public class FactroyC implements AbstractFactory {

    @Override
    public Object getInstance() {
        return new FactroyC();
    }
}
