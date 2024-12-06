package com.guava;

import com.google.common.collect.Range;

public class RangeDemo {

    public static void main(String[] args) {
        // 创建一个闭区间范围 [1, 10]
        Range<Integer> closedRange = Range.closed(1, 10);

        // 创建一个闭区间范围 (1, 10)
        Range<Integer> openRange = Range.open(1, 10);

        // 创建一个闭区间范围 [1, 10)
//        Range.closedOpen();
//        Range.openClosed();

        System.out.println("closedRange:" + closedRange.contains(1));
        System.out.println("openRange:" + closedRange.contains(1));


        final Range<Integer> span = closedRange.span(Range.openClosed(10, 30));
        final Range<Integer> gap = openRange.gap(Range.closedOpen(15, 30));

        System.out.println("span:" + span.contains(10));
        System.out.println("gap:" + gap.contains(11));
    }
}
