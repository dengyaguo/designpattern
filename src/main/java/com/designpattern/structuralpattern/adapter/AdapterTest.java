package com.designpattern.structuralpattern.adapter;

public class AdapterTest {
    //adapter
    //测试适配器模式
    //通过第三方连接两个不一样的接口类似USB的功能
    public static void main(String[] args) {
        Target target = new MyAdapter();
        target.request();
    }
}
