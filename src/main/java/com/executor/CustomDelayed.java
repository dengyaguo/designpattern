package com.executor;

import java.util.Random;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class CustomDelayed implements Delayed {

    private static final Random random = new Random();

    @Override
    public long getDelay(TimeUnit unit) {
        return random.nextInt(10);
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}
