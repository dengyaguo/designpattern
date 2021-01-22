package com.bit;

import com.google.common.hash.Funnels;

import java.nio.charset.Charset;

public class BloomFilterTest {
    public static void main(String[] args) {
        // 创建布隆过滤器，设置存储的数据类型，预期数据量，误判率 (必须大于0，小于1)
        int insertions = 10000000;
        double fpp = 0.0001;
        com.google.common.hash.BloomFilter<String> bloomFilter = com.google.common.hash.BloomFilter.create(Funnels.stringFunnel(Charset.defaultCharset()), insertions, fpp);
        bloomFilter.put("123");
        bloomFilter.approximateElementCount();
        System.out.println(bloomFilter.mightContain("123"));
    }
}
