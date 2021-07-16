package com.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @Description: </br>  condition测试
 * @Project: </br>
 * @CreateDate: Created in </br>
 * @Author: <a href="624976130@qq.com">buyi</a>
 */
public class ConditionTest {
    public static void main(String[] args) throws InterruptedException {

        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();
        reentrantLock.lock();
        condition.await();
        condition.signal();
        reentrantLock.unlock();


        System.out.println("master 23:28");
    }
}
