package com.bit;

import cn.hutool.bloomfilter.bitMap.BitMap;

public class MyLongMap  implements BitMap {

    private static final long MAX = Long.MAX_VALUE;

    private static final int  MACHINE64 = 64;
    private long[] longs = null;

    /**
     * 构造
     * 1亿数据，对象内存大小：119M
     */
    public MyLongMap() {
        longs = new long[15625000];
    }

    /**
     * 构造
     *
     * @param size 容量
     */
    public MyLongMap(int size) {
        longs = new long[size];
    }

    @Override
    public void add(long i) {
        int r = (int) (i / MACHINE64);
        long c = i % MACHINE64;
        longs[r] = longs[r] | (1 << c);
    }

    @Override
    public boolean contains(long i) {
        int r = (int) (i / MACHINE64);
        long c = i % MACHINE64;
        if (((longs[r] >>> c) & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public void remove(long i) {
        int r = (int) (i / MACHINE64);
        long c = i % MACHINE64;
        longs[r] = longs[r] & (((1 << (c + 1)) - 1) ^ MAX);
    }

}