package com.hutool;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        System.out.println(isEmpty("1"));
    }


    /**
     * 字符串是否为空
     */
    public static  boolean isEmpty(String foo) {
        return (foo == null || foo.trim().length() == 0);
    }
}
