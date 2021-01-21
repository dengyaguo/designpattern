package com.designpattern.behaviorpattern.observer;

/**
 * @ClassName:      ObserverPatternTest
 * @Description:    观察者模式
 * @Author:         buyi
 * @Version:        1.0
 * 业务场景：一个微信公众号服务，不定时发布一些消息，关注公众号就可以收到推送消息，取消关注就收不到推送消息
*/
public class ObserverPatternTest {
    /**
     * 观察者是被动的，通知者来告知观察者的行为（此处的通知者 粗浅认为和访问者模式中的访问者类似）
     * @param args
     */
    public static void main(String[] args) {
        MyObservable myObservable = new MyObservable();
        MyObserver myObserver = new MyObserver();
        myObservable.addObserver(myObserver);
        for (int i = 0; i < 10; i++) {
            myObservable.setData(i);
        }
        myObservable.deleteObserver(myObserver);//GC
    }
}
