package com.executor;


import cn.hutool.core.thread.NamedThreadFactory;

import java.util.concurrent.*;

public class CompletableFutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executorService = new ThreadPoolExecutor(4,4,1,
                TimeUnit.MINUTES,new LinkedBlockingDeque<>(100), new NamedThreadFactory("test-thread",false),new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 10; i++) {
            int finalI = i;
           new Thread(() -> {
               try {
                   test(finalI,executorService);
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }).start();
        }
    }

    public static void test(int i,ThreadPoolExecutor executorService) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(200);
                System.out.println(i+"-thread-1:"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },executorService);
        CompletableFuture<Void> completableFuture2 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(180);
                System.out.println(i+"-thread-2:"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },executorService);
        CompletableFuture<Void> completableFuture3 = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(150);
                //int i = 1 / 0;
                System.out.println(i+"-thread-3:"+Thread.currentThread().getName());
            } catch (Exception e) {
                // throw new RuntimeException("RuntimeException  JAVA");
            }
        },executorService);

        CompletableFuture<Void> completableFuture = CompletableFuture.allOf(completableFuture1, completableFuture2, completableFuture3)
/*                .whenComplete(
                (aVoid, throwable) -> {
                    System.out.println("whenComplete:" + Thread.currentThread().getName());
                }
        )*/
                ;
        completableFuture.get();
        long end = System.currentTimeMillis();
        System.out.println(i+"-消耗时间："+(end-start));
    }
}
