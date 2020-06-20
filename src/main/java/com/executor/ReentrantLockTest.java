package com.executor;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 *   final void lock() {
 *             if (compareAndSetState(0, 1))
 *                 setExclusiveOwnerThread(Thread.currentThread());
 *             else
 *                 acquire(1);
 *  }
 *
 * 重入锁
 */
public class ReentrantLockTest {
    public static void main(String[] args) {
        ReentrantLock nonfairLock = new ReentrantLock();//默认的非公平锁
        nonfairLock.lock();
        nonfairLock.unlock();
        ReentrantLock fairLock = new ReentrantLock(true);//公平锁
        fairLock.lock();
        fairLock.unlock();
    }
}
