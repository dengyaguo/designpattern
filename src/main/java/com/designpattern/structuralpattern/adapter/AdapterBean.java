package com.designpattern.structuralpattern.adapter;

public class AdapterBean implements Component{

    private Source  source;

    public AdapterBean(Source source) {
        this.source = source;
    }

    @Override
    public void methodOld() {
        System.out.println("this is old method");
    }

    @Override
    public void methodNew() {
        source.methodNew();
    }
}
