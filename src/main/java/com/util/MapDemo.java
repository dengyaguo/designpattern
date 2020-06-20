package com.util;

import cn.hutool.core.util.RandomUtil;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @Author  布衣神相
 * 0x7fffffff -->> 0111 1111 1111 1111 1111 1111 1111 1111 Interger.MAX
 *
 */
public class MapDemo {

    public static void main(String[] args) {
        Integer integer = new Integer(3);
        boolean equals = Objects.equals(3, integer);
        System.out.println(equals);
        HashMap<Object, Object> hashMap = new HashMap<>();
        Set<Object> objects = hashMap.keySet();
        objects.contains("1");
//
//        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.put(null,null);
//        linkedHashMap.get(null);
//
//        ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
//        concurrentHashMap.put(null,null);
//        concurrentHashMap.get(null);


//        List<String> arrayList = null;
//        List<String> collect = arrayList.stream().collect(Collectors.toList());


//        for (int i = 0; i < 1000000000; i++) {
//            System.out.println(RandomUtil.randomLong(-5, -0));
//        }

    }
}
