package com.designpattern.behaviorpattern.command;

/**
 * 厨师
 */
public class Chef implements Execute{

    public void cooking(){
        System.out.println("厨师烹饪ing");
    }

    @Override
    public void execute() {
        cooking();
    }
}
