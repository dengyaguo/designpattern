package com.designpattern.behaviorpattern.strategy;

public class ConcreteStrategyB extends Strategy {
    @Override
    void solveProblem(MyProblem problem) {
        System.out.println("通过B算法解决问题"+problem);
    }
}
