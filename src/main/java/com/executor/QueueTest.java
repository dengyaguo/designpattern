package com.executor;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 *     public ArrayBlockingQueue(int capacity, boolean fair) {
 *         if (capacity <= 0)
 *             throw new IllegalArgumentException();
 *         this.items = new Object[capacity];
 *         lock = new ReentrantLock(fair);
 *         notEmpty = lock.newCondition();
 *         notFull =  lock.newCondition();
 *     }
 *
 * @Description: </br>
 * @Project: </br>
 * @CreateDate: Created in 2020-06-20  </br>
 * @Author: <a href="624976130@qq.com">buyi</a>
 */
public class QueueTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<String>(10,true);
        arrayBlockingQueue.put("");
        arrayBlockingQueue.take();


        LinkedBlockingDeque<Object> linkedBlockingDeque = new LinkedBlockingDeque<>(10);
        linkedBlockingDeque.put("");
        linkedBlockingDeque.take();
    }
}
