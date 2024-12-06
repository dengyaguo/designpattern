package com.guava;

import com.google.common.collect.Ordering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrderingDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Ordering<String> byLengthDesc = Ordering.from((s1, s2) -> Integer.compare(s2.length(), s1.length()));
//        final Comparator<String> stringComparator = byLengthDesc.thenComparing();

        final Ordering<String> compound = byLengthDesc.compound((s1, s2) -> Integer.compare(s2.length(), s1.length()));

        //前三个最大的元素
        compound.greatestOf(names, 3);
        //后三个最小的元素
        compound.leastOf(names, 3);

        final String max = byLengthDesc.max(names);
        final String min = byLengthDesc.min(names);
        System.out.println(max);
        System.out.println(min);


        //java stream流
        final List<String> top3 = names.stream().limit(3).collect(Collectors.toList());
        final String max0 = names.stream().max((s1, s2) -> Integer.compare(s2.length(), s1.length())).orElse(null);
    }
}
