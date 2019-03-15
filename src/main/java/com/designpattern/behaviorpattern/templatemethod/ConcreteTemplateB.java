package com.designpattern.behaviorpattern.templatemethod;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ConcreteTemplateB extends AbstractTemplate {
    @Override
    void operation1() {
        System.out.println("B 操作1");
    }

    @Override
    void operation2() {
        System.out.println("B 操作2");
    }
}
