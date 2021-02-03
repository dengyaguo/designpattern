package com.bit;

import cn.hutool.bloomfilter.bitMap.BitMap;
import cn.hutool.bloomfilter.bitMap.LongMap;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.stream.LongStream;

public class BitTest {

    private final static long sequenceBits = 10L;

    private final static long sequenceMask = ~(-1L << sequenceBits);


    public static void main(String[] args) {
        System.out.println(9999999999999l/93750000);
        compareSize();
    }


    /**
     *  比较大小
     */
    private static void compareSize() {
        int i = 0;
        for (;;){
            i++;
            long flag = i & sequenceMask;
            if(flag == 0){
                System.out.println("最大数：" + i);
                break;
            }
        }
    }
}
