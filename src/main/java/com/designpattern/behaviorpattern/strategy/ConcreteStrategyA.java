package com.designpattern.behaviorpattern.strategy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ConcreteStrategyA extends Strategy {
    @Override
    void solveProblem(MyProblem problem) {
        System.out.println("通过A算法解决问题"+problem);
    }
}
