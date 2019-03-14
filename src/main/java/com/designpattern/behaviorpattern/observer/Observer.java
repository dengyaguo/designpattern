package com.designpattern.behaviorpattern.observer;

/**
 * 观察者接口
 */
public interface Observer {

    void registerObserver(ObserverBehavior o);

    void removeObserver(ObserverBehavior o);

    void notifyObserver();
}
