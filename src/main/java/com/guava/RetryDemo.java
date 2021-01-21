package com.guava;

import com.github.rholder.retry.*;
import com.google.common.base.Predicates;
import org.springframework.util.StopWatch;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class RetryDemo {

    static AtomicInteger atomicInteger = new AtomicInteger(0);

    static Retryer<String> retryer;

    static int count = 0;

    static {
        retryer = RetryerBuilder.<String>newBuilder().retryIfResult(Predicates.equalTo("false")) // 返回false时重试
                .withWaitStrategy(WaitStrategies.fixedWait(10, TimeUnit.MILLISECONDS)) // ms后重试
                .withStopStrategy(StopStrategies.stopAfterAttempt(20)) // 重试20次后停止
                .build();
    }

    public static void main(String[] args) throws ExecutionException, RetryException {

        long start = System.currentTimeMillis();
        String s = testRetry(3);
        long end = System.currentTimeMillis();
        System.out.println(s +"-"+ (end-start));
    }

    private static String testRetry(int limit) throws ExecutionException, RetryException {
        String call = retryer.call(() -> {
            System.out.println("调用：");
            Thread.sleep(1000);
            int i = atomicInteger.addAndGet(1);
            if(i == limit){
                return "";
            }
            return "false";
        });
        return call;
    }
}
