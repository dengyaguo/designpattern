package com.concurrent;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo{
    public static void main(String[] args) throws InterruptedException {
        Semaphore se = new Semaphore(4);
        se.acquire();


        se.release();
    }
}
