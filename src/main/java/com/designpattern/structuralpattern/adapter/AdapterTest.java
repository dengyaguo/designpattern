package com.designpattern.structuralpattern.adapter;

public class AdapterTest {
    //测试适配器模式
    public static void main(String[] args) {
        Target target = new MyAdapter();
        target.request();
    }
}
