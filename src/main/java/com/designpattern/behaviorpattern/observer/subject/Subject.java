package com.designpattern.behaviorpattern.observer.subject;


import com.designpattern.behaviorpattern.observer.core.EventLisenter;

/**
 * Created by Tom on 2018/3/17.
 */
public class Subject extends EventLisenter {

    //通常的话，采用动态里来实现监控，避免了代码侵入
    public void add(){
        System.out.println("调用添加的方法");
        trigger(SubjectEventType.ON_ADD);
    }

    public void remove(){
        System.out.println("调用删除的方法");
        trigger(SubjectEventType.ON_RMOVE);
    }

}
