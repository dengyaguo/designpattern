package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static com.sun.xml.internal.fastinfoset.util.ValueArray.MAXIMUM_CAPACITY;

/**
 * map test
 */
public class MapDemo {
    private static int RESIZE_STAMP_BITS = 16;

    public static void main(String[] args) {

        ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(null,null);
        concurrentHashMap.get(null);

        Map<Object, Object> dataMap = new HashMap<>(17);
        dataMap.put(null, null);
        dataMap.get(null);
        int i = tableSizeFor(333);
    }


    static final int resizeStamp(int n) {
        //hash = (h ^ (h >>> 16)) & HASH_BITS;

        // n为16（10000）时候，Integer.numberOfLeadingZeros(n) = 27  ，(1 << (RESIZE_STAMP_BITS - 1) =0000 0000 0000 0000 1000 0000 0000 0000
        // 0000 0000 0000 0000 0000 0000 0001 1011   (27)
        // 0000 0000 0000 0000 1000 0000 0000 0000   ((1 << (RESIZE_STAMP_BITS - 1))
        // 0000 0000 0000 0000 1000 0000 0001 1011   结果
        // 1000 0000 0001 1011 0000 0000 0000 0010(rs << RESIZE_STAMP_SHIFT) + 2)
        return Integer.numberOfLeadingZeros(n) | (1 << (RESIZE_STAMP_BITS - 1));
    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
