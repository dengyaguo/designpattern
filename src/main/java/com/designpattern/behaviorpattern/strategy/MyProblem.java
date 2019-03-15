package com.designpattern.behaviorpattern.strategy;

public class MyProblem {

    private  Strategy strategy;

    public MyProblem(Strategy strategy, String name) {
        this.strategy = strategy;
        this.name = name;
    }

    public MyProblem() { }

    public MyProblem(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyProblem{" +
                "name='" + name + '\'' +
                '}';
    }

    public void  solve(){
        strategy.solveProblem(this);
    }
}
