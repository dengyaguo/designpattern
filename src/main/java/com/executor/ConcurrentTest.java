package com.executor;

import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentTest {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.addAndGet(1);


    }
}
