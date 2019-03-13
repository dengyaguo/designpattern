package com.designpattern.structuralpattern.adapter;

/**
 * 适配器模式  测试类
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题
 * 分三类：类适配器  对象适配器 接口适配器
 */
public class AdapterTest {
    public static void main(String[] args) {

        //类适配器
        AdapterClass adapter = new AdapterClass();
        adapter.methodOld();
        adapter.methodNew();

        //对象适配器
        Source source = new Source();
        AdapterBean adapterBean = new AdapterBean(source);
        adapterBean.methodOld();
        adapterBean.methodNew();

        //接口适配器
        AdapterImplOld adapterImplOld = new AdapterImplOld();
        adapterImplOld.methodOld();
        AdapterImplNew adapterImplNew = new AdapterImplNew();
        adapterImplNew.methodNew();

    }
}
