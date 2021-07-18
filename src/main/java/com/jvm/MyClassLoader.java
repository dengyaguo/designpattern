package com.jvm;

import java.sql.Driver;
import java.util.ServiceLoader;

public class MyClassLoader {

    public static void main(String[] args) {

        ServiceLoader<Driver> load = ServiceLoader.load(Driver.class);
        System.out.println(load.getClass().getClassLoader());

        System.out.println("cherry0-pick");
        System.out.println("cherry1-pick");
    }
}
