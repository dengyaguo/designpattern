package com.designpattern.behaviorpattern.myobserver;

/**
 * 观察者接口
 */
public interface Observer {

    void registerObserver(ObserverBehavior o);

    void removeObserver(ObserverBehavior o);

    void notifyObserver();
}
