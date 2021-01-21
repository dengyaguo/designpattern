package com.guava;

import com.google.common.util.concurrent.*;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FutureDemo {

    public static void main(String[] args) throws Exception {
        //guavaFuture();

        //guavaFuture2();

        Callable callable = ()->{return  "123";};
        Object call = callable.call();
    }


    public static void guavaFuture() throws Exception {
        long timeMillis = System.currentTimeMillis();
        ListeningExecutorService guavaExecutor = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
        final ListenableFuture<String> listenableFuture = guavaExecutor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                TimeUnit.SECONDS.sleep(1);
                return "success";
            }
        });
        // 注册监听器,即异步调用完成时会在指定的线程池中执行注册的监听器
        listenableFuture.addListener(() -> {
            try {
                listenableFuture.get();
                System.out.println("[ListenableFuture.get()结束时间：]----->>>>>" + (System.currentTimeMillis() - timeMillis));
            } catch (Exception e) {

            }
        }, Executors.newSingleThreadExecutor());
        // 主线程可以继续执行,异步完成后会执行注册的监听器任务.
        System.out.println("[ListenableFuture主线程结束时间：]----->>>>>" + (System.currentTimeMillis() - timeMillis));
    }




    public static void guavaFuture2() throws Exception {
        long timeMillis = System.currentTimeMillis();
        ListeningExecutorService guavaExecutor2 = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
        final ListenableFuture<String> listenableFuture2 = guavaExecutor2.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("FutureCallback" + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
                return "success";
            }
        });

        // 注意这里没用指定执行回调的线程池,从输出可以看出默认是和执行异步操作的线程是同一个
        Futures.addCallback(listenableFuture2, new FutureCallback<String>() {
                    @Override
                    public void onSuccess(String result) {
                        System.out.println("FutureCallback" + Thread.currentThread().getName());
                        System.out.println("[FutureCallback结束时间：]----->>>>>" + (System.currentTimeMillis() - timeMillis));
                    }

                    @Override
                    public void onFailure(Throwable t) {
                    }
                },Executors.newSingleThreadExecutor()
        );
        // 主线程可以继续执行,异步完成后会执行注册的监听器任务
        System.out.println("[FutureCallback主线程结束时间：]----->>>>>" + (System.currentTimeMillis() - timeMillis));
    }
}

