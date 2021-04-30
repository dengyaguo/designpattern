package com.executor;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Demo {
    private final static ScheduledThreadPoolExecutor scheduledThreadPool = new ScheduledThreadPoolExecutor(1);
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            scheduledThreadPool.execute(() -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        );
        }
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("yyyy:"+scheduledThreadPool.getQueue().size());
        }
    }
}
