package com.designpattern.behaviorpattern.observer;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:      ObserverPatternTest
 * @Description:    观察者模式
 * @Author:         buyi
 * @Version:        1.0
 * 业务场景：一个微信公众号服务，不定时发布一些消息，关注公众号就可以收到推送消息，取消关注就收不到推送消息
*/
public class ObserverPatternTest implements Observer{
    private static List<ObserverBehavior>  accountList = new ArrayList<>();

    @Override
    public void registerObserver(ObserverBehavior o) {
        accountList.add(o);
    }

    @Override
    public void removeObserver(ObserverBehavior o) {
       if(!CollectionUtils.isEmpty(accountList)){
           accountList.remove(o);
       }
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < accountList.size(); i++) {
            ObserverBehavior oserver = accountList.get(i);
            oserver.update("微信服务更新消息：java是世界上最好的语言");
        }
    }

    /**
     * 观察者是被动的，通知者来告知观察者的行为（此处的通知者 粗浅认为和访问者模式中的访问者类似）
     * @param args
     */
    public static void main(String[] args) {
        WechatAccount aaa = new WechatAccount("马云", "123456");
        WechatAccount bbb = new WechatAccount("马化腾", "123456");
        ObserverPatternTest test = new ObserverPatternTest();
        test.registerObserver(aaa);
        test.registerObserver(bbb);
        test.notifyObserver();

    }
}
