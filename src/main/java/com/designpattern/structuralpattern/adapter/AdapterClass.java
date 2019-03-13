package com.designpattern.structuralpattern.adapter;

public class AdapterClass extends Source implements Component {
    @Override
    public void methodOld() {
        System.out.println("this is old method");
    }
}
