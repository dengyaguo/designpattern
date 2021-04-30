package com.jvm;

import java.sql.Driver;
import java.util.ServiceLoader;

public class MyClassLoader {

    public static void main(String[] args) {

        ServiceLoader<Driver> load = ServiceLoader.load(Driver.class);
        System.out.println(load.getClass().getClassLoader());
    }
}
