package com.designpattern.behaviorpattern.visitor;

/**
 * 访问者模式测试代码
 *
 *  visitor
 *  accept(visitor)
 *
 *
 */
public class VisitorTest {
    public static void main(String[] args) {
        SwaggerElementObject swagger = new SwaggerElementObject();
        swagger.add(new ConcreteElementOne());
        swagger.add(new ConcreteElementTwo());
        //访问者主动发起动作
        swagger.accept(new ConcreteVisitorA());

    }
}
