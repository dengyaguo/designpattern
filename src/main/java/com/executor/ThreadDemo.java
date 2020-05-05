package com.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *  布衣神相
 */
public class ThreadDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.submit((Callable<Object>) null);
    }
}
