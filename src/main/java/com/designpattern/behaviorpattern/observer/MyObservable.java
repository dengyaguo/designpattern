package com.designpattern.behaviorpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class MyObservable extends Observable{
//    @Override
//    public synchronized void addObserver(Observer o) {
//        super.addObserver(o);
//    }
//
//    @Override
//    protected synchronized void setChanged() {
//        super.setChanged();
//    }
//
    @Override
    public void notifyObservers(Object arg) {

        super.notifyObservers(arg);
    }
//
//    @Override
//    public void notifyObservers() {
//        super.notifyObservers();
//    }
          int data = 0;

          public void setData(int i) {
              data = i;
              setChanged();    //标记此 Observable对象为已改变的对象
              notifyObservers(i);    //通知所有观察者
          }
}
