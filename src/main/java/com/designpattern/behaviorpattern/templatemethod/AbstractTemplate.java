package com.designpattern.behaviorpattern.templatemethod;

public abstract class AbstractTemplate {

    abstract void operation1();
    abstract void operation2();

    public  void  templateMethod(){
        operation1();
        operation2();
    }
}
