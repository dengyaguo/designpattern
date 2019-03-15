package com.designpattern.behaviorpattern.observer;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.bind.SchemaOutputResolver;

/**
 * 模拟微信用户表
 */
public class WechatAccount implements ObserverBehavior{
    WechatAccount(){}

    public WechatAccount(String name, String password) {
        this.name = name;
        this.password = password;
    }


    private String name;
    private String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "WechatAccount{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public void update(String message) {
        read(message);
    }

    public void read(String message) {

        System.out.println(name + " 收到推送消息： " + this.toString());
        System.out.println(message);
    }
}
