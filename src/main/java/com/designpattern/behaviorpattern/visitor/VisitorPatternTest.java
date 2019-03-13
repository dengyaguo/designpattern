package com.designpattern.behaviorpattern.visitor;
/**
 * @ClassName:      VisitorPatternDemo
 * @Description:    访问者模式
 * @Author:         布衣
 * @Version:        1.0
*/
public class VisitorPatternTest {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}