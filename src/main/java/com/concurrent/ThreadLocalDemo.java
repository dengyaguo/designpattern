package com.concurrent;

import java.util.StringJoiner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 0
 * 7
 * 14
 * 5
 * 12
 * 3
 * 10
 * 1
 * 8
 * 15
 * 6
 * 13
 * 4
 * 11
 * 2
 * 9
 *
 * 斐波那契散列
 * 0x61c88647
 * 十进制：14162103107
 * 二进制：1100001110010001000011001000111
 */
public class ThreadLocalDemo {
    private final int threadLocalHashCode = nextHashCode();

    /**
     * The next hash code to be given out. Updated atomically. Starts at
     * zero.
     */
    private static AtomicInteger nextHashCode =
            new AtomicInteger();

    /**
     * The difference between successively generated hash codes - turns
     * implicit sequential thread-local IDs into near-optimally spread
     * multiplicative hash values for power-of-two-sized tables.
     */
    private static final int HASH_INCREMENT = 0x61c88647;

    /**
     * Returns the next hash code.
     */
    private static int nextHashCode() {
        return nextHashCode.getAndAdd(HASH_INCREMENT);
    }

    public static void main(String[] args) {
        ThreadLocal<Object> threadLocal = new ThreadLocal<>();
        threadLocal.set(null);
        threadLocal.get();
        threadLocal.remove();


        StringJoiner stringJoiner = new StringJoiner("");
        for (int i = 0; i < 20; i++) {
            ThreadLocalDemo localDemo = new ThreadLocalDemo();
            stringJoiner.add(String.valueOf(localDemo.threadLocalHashCode & 15) ).add(" ");
        }
        System.out.println(stringJoiner.toString());

    }
}

