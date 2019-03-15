package com.designpattern.behaviorpattern.strategy;

public class StrategyTest {
    //策略模式(if else 和switch case 的替代)
    public static void main(String[] args) {
        MyProblem myProblem = new MyProblem(new ConcreteStrategyA(),"算法A");
        myProblem.solve();
    }
}
