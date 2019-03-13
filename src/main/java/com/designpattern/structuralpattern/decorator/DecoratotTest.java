package com.designpattern.structuralpattern.decorator;

/**
 * 装饰者模式测试类
 * 装饰模式的特点：在不必改变原类文件和使用继承的情况下，动态地扩展一个对象的功能。它是通过创建一个包装对象，也就是装饰来包裹真实的对象,就增加功能来说,比生成子类更为灵活。
 * 1.Component
 *  定义一个对象接口，可以给这些对象动态地添加职责。
 *  2.ConcreteComponent
 *  定义一个对象，可以给这个对象添加一些职责。
 *  3.Decorator
 *  维持一个指向 Component 对象的指针，并定义一个与 Component 接口一致的接口。
 *  4.ConcreteDecorator
 *  向组件添加职责。
 */
public class DecoratotTest {
    public static void main(String[] args) {
        Decorator decorator = new Decorator(new ConcreteComponent());
        decorator.method();
    }
}
