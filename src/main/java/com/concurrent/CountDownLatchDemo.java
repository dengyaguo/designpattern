package com.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * 计数器
 */
public class CountDownLatchDemo
{

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        countDownLatch.countDown();
        countDownLatch.await();

    }
}
