package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 二大爷算法
 */
public class WaterTest {

    public static void main(String[] args) {
        List<Integer> source = Arrays.asList(4, 2, 3, 2, 5, 6, 0, 2, 3, 6);
        //分组
        List<List<Integer>> temp = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(source.get(0));
        first.add(source.get(1));
        temp.add(first);
        for (int i = 2; i < source.size(); i++) {
            Integer current = source.get(i);
            Integer last = source.get(i - 1);
            List<Integer> lastList = temp.get(temp.size() - 1);
            boolean currentTrend = current - last > 0;
            boolean lastTrend = lastList.get(lastList.size() - 1) - lastList.get(0) > 0;
            if (currentTrend == lastTrend) {
                lastList.add(current);
            } else {
                List<Integer> newNode = new ArrayList<>();
                newNode.add(last);
                newNode.add(current);
                temp.add(newNode);
            }
        }
        System.out.println(temp.toString());

        //合并
        List<List<Integer>> target = new ArrayList<>(temp.size() / 2);
        for (int i = 1; i < temp.size(); i++) {
            if (1 == i % 2) {
                List<Integer> left = temp.get(i - 1);
                List<Integer> right = temp.get(i);
                List<Integer> merge = new ArrayList<>(left);
                for (int i1 = 1; i1 < right.size(); i1++) {
                    merge.add(right.get(i1));
                }
                target.add(merge);
            }
        }
        System.out.println(target.toString());

        //合并
        List<List<List<Integer>>> temp1 = new ArrayList<>();
        List<List<Integer>> firstMerge = new ArrayList<>();
        firstMerge.add(target.get(0));
        temp1.add(firstMerge);
        for (int i = 1; i < target.size(); i++) {
            List<Integer> current = target.get(i);
            Integer currentNode = current.get(current.size() - 1);
            List<List<Integer>> lastMerge = temp1.get(temp1.size() - 1);
            List<Integer> lastMergeNode = lastMerge.get(lastMerge.size() - 1);
            Integer last = lastMergeNode.get(lastMergeNode.size() - 1);
            if (currentNode > last) {
                lastMerge.add(current);
            } else {
                List<List<Integer>> other = new ArrayList<>();
                other.add(current);
                temp1.add(other);
            }
        }
        System.out.println(temp1.toString());


        List<List<Integer>> temp2 = new ArrayList<>();
        for (int i = 0; i < temp1.size(); i++) {
            List<List<Integer>> in = temp1.get(i);
            List<Integer>integerList2=new ArrayList<>();
            for (int i1 = 0; i1 < in.size(); i1++) {
                List<Integer> integerList = in.get(i1);
                List<Integer> integerList1;
                if (0 == i1) {
                    integerList1 = integerList.subList(0, integerList.size() );
                }
                else {
                    integerList1 = integerList.subList(1, integerList.size() );
                }
                integerList2.addAll(integerList1);
            }

            temp2.add(integerList2);
        }
        System.out.println(temp2.toString());


        int sum1 = 0;
        for (List<Integer> integers : temp2) {
            Integer left = integers.get(0);
            Integer right = integers.get(integers.size() - 1);
            Integer min = left < right ? left : right;
            for (Integer integer : integers) {
                if (integer < min) {
                    sum1 += min - integer;
                }
            }
        }
        System.out.println(sum1);
    }
}
