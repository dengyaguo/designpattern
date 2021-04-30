package com.executor;

import java.util.Random;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class CustomDelayed implements Delayed {

    private static final Random random = new Random();

    private int delay;

    public CustomDelayed(int delay) {
        this.delay = delay;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return delay;
    }

    @Override
    public int compareTo(Delayed o) {
        return this.getDelay(null)>o.getDelay(null)?1:0;
    }
}
