package com.designpattern.behaviorpattern.templatemethod;

public abstract class AbstractTemplate {

    abstract void operation1();
    abstract void operation2();
    abstract void operation3();



    public  void  templateMethod(){
        operation1();
        operation2();
        if(isExceuteMethod3()){
            operation3();
        }
    }

    public boolean isExceuteMethod3(){
        return true;
    }
}
