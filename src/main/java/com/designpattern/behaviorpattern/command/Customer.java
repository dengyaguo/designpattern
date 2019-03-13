package com.designpattern.behaviorpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List list = new ArrayList();
    public void orderDishes() {
        for (int i = 0; i < list.size(); i++) {
            Command command = (Command)list.get(i);
            command.execute();
        }
    }

    public void addCommand(Command command) {
        list.add(command);
    }

}
