package com.designpattern.behaviorpattern.command;

public class CookCommand implements Command {
    public CookCommand(Chef chef) {
        this.chef = chef;
    }
    private Chef chef;
    @Override
    public void execute() {
        chef.execute();
    }
}
