package com.designpattern.structuralpattern.proxy.staticproxy;

public class Father implements Person {
    public Father() { }

    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    @Override
    public void findLove() {
        System.out.println("要求门当父对");
        person.findLove();
        System.out.println("找到了爱");

    }

    @Override
    public void findJob() {
        System.out.println("父亲：离家近");
        person.findJob();
        System.out.println("找到了工作");

    }
}
