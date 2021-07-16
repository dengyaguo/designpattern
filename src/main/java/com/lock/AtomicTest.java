package com.lock;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.LongBinaryOperator;

@Slf4j
public class AtomicTest {
    /**
     * unsafe.compareAndSwapInt(this, valueOffset, e, u)
     * cas操作
     *
     *
     *     public void add(long x) {
     *         Cell[] as; long b, v; int m; Cell a;
     *         if ((as = cells) != null || !casBase(b = base, b + x)) {
     *             boolean uncontended = true;
     *             if (as == null || (m = as.length - 1) < 0 ||
     *                 (a = as[getProbe() & m]) == null ||
     *                 !(uncontended = a.cas(v = a.value, v + x)))
     *                 longAccumulate(x, null, uncontended);
     *         }
     *     }
     */
    public static void main(String[] args) {
        AtomicBoolean ab = new AtomicBoolean(false);
        boolean flag = ab.compareAndSet(false, true);
        System.out.println(flag);

        AtomicLong atomicLong = new AtomicLong(0);
        long addLong = atomicLong.addAndGet(1);
        System.out.println(addLong);

         //TODO 高并发cas操作性能影响
        LongAdder longAdder = new LongAdder();
        longAdder.increment();
        long l = longAdder.longValue();

        //采用base加数组【transient volatile Cell[] cells】维护大小
        LongBinaryOperator apply = AtomicTest::accumulatorFunction;
        LongAccumulator longAccumulator = new LongAccumulator(apply,1l);
        longAccumulator.accumulate(3);
        long v1 = longAccumulator.get();
        longAccumulator.accumulate(3);
        long v2 = longAccumulator.get();
        System.out.println("v1:"+ v1 +"   v2:"+ v2);//v1:3   v2:9

        System.out.println("rebase 23:02");
    }

    public static long accumulatorFunction(long left,long right){
        return left * right;
    }
}
