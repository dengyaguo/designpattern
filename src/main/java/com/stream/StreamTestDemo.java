package com.stream;

import com.google.common.base.Supplier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public  class StreamTestDemo {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE);
        long count = list.stream().reduce(0L, (a, b) -> (a + b), (a,b) -> 0L);
        System.out.println(count);

        Optional.ofNullable("111").ifPresent(o -> System.out.println("not null"));
        Optional<String> s = Optional.ofNullable("111");

        new StreamTestDemo().test3();
        String o = test1("1",(t)->t+"1");
    }

    private static String test1(String t,TestFunction<String,String> function) {
        String test = function.test(t);
        return test;
    }




    private  String test2(String t) {
        return "";
    }

    private  void test3(String t) {
        System.out.println(t);
    }

    private String test3(){
        Consumer<String> consumer = this::test3;
        consumer.accept("test consumer");

        TestFunction<String, String> test2 = this::test2;
        return test2.test("1");
    }
}
