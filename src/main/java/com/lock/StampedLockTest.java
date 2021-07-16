package com.lock;

import java.util.concurrent.locks.StampedLock;

/**
 * StampedLock提供了乐观读锁，可取代ReadWriteLock以进一步提升并发性能；
 * <p>
 * StampedLock是不可重入锁
 */
public class StampedLockTest {
    private final StampedLock stampedLock = new StampedLock();

    public static void main(String[] args) {
        StampedLockTest test = new StampedLockTest();
        test.write();
        test.read();

        System.out.println("rebase 23:29");
    }


    public void write() {
        long stamp = stampedLock.writeLock(); // 获取写锁
        try {
            //写数据
        } finally {
            stampedLock.unlockWrite(stamp); // 释放写锁
        }
    }


    public Object read() {
        long stamp = stampedLock.tryOptimisticRead(); // 获得一个乐观读锁
         //读数据
        if (!stampedLock.validate(stamp)) { // 检查乐观读锁后是否有其他写锁发生
            stamp = stampedLock.readLock(); // 获取一个悲观读锁
            try {
               //再一次读数据
            } finally {
                stampedLock.unlockRead(stamp); // 释放悲观读锁
            }
        }
        return new Object();
    }
}
