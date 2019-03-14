package com.designpattern.structuralpattern.adapter;

/**
 * @ClassName:      MyAdapter
 * @Description:    适配器
 * @Author:         admin
 * @Version:        1.0
*/
public class MyAdapter implements Target {
    private RealAdaptee realAdaptee = new RealAdaptee();

    @Override
    public void request() {
        realAdaptee.realRequest();
    }
}
