package com.concurrent;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 *
 * 读多写少场景，写操作的时候，需要拷贝数组，会消耗内存
 *
 * 不能用于实时读的场景
 *
 */
public class CopyOnWriteArrayDemo {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> swl = new CopyOnWriteArrayList<>();
        swl.add(null);
        swl.get(0);

        CopyOnWriteArraySet sws = new CopyOnWriteArraySet();
        sws.add(null);
        sws.contains(null);

    }
}
