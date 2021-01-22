package com.executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 *  常见的出队和入队的方法
 *    add 添加一个元素，如果队列已满，则抛出异常
 *   remove 移除并返回队列头部的元素，如果队列已空，则抛出异常
 *   peek 返回队列头部的元素，如果队列为空，则返回null
 *   offer 添加元素，成功true，否则false
 *   poll 返回头部元素，如果为空，则返回null
 *   put 添加元素 ，如果队列已满，阻塞
 *   take 移除并返回头部元素 ，如果队列已空，阻塞
 *
 *
 *
 */
public class QueueTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<String>(10,true);
        arrayBlockingQueue.put("");
        arrayBlockingQueue.take();


        LinkedBlockingDeque<String> linkedBlockingDeque = new LinkedBlockingDeque<>(10);
        linkedBlockingDeque.put("");
        linkedBlockingDeque.take();

        //todo  延迟队列
        DelayQueue<CustomDelayed> delayQueue = new DelayQueue<CustomDelayed>();
        delayQueue.offer(null);
        delayQueue.poll();
        delayQueue.take();
    }
}
