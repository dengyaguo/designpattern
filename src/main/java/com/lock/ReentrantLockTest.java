package com.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantLockTest<T> {

    private final Lock lock = new ReentrantLock();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final Lock rlock = readWriteLock.readLock();
    private final Lock wlock = readWriteLock.writeLock();

    public static void main(String[] args) {
        ReentrantLockTest reentrantLockTest = new ReentrantLockTest();
        reentrantLockTest.read();
        reentrantLockTest.write();
        //只允许一个线程写入（其他线程既不能写入也不能读取）；
        //没有写入时，多个线程允许同时读（提高性能）

    }

    public void write() {
        lock.lock();
        try {
            //写数据
        } finally {
            lock.unlock();
        }
    }

    public T read() {
        lock.lock();
        try {
            //读数据
            return (T)new Object();
        } finally {
            lock.unlock();
        }
    }

    public void readWriteLock_write() {
        wlock.lock();
        try {
            //写数据
        } finally {
            wlock.unlock();
        }
    }

    public T readWriteLock_read() {
        rlock.lock();
        try {
            //读数据
            return (T)new Object();
        } finally {
            rlock.unlock();
        }
    }


}
