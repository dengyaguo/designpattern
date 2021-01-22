package com.guava;

import com.google.common.base.Strings;

/**
 * guava demo
 */
public class StringDemo {
    public static void main(String[] args) {
        String demo1 = Strings.padStart("demo", 6, '1');
        String demo2 = Strings.padEnd("demo", 5, '1');
        String s = Strings.lenientFormat("%s12313%s", "start", "end");
        System.out.println(demo1 + "   " + demo2 + "  " +  s);
    }
}
