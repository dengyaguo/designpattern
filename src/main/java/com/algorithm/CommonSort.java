package com.algorithm;

import java.util.List;

public class CommonSort {


    public static void main(String[] args) {
        int[] target = {1, 9, 7, 5, 3};
        bubbleSort(target);
        printInfo("冒泡",target);

        selectSort(target);
        printInfo("选择",target);
    }

        private static void printInfo(String methodName,int[] target) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < target.length; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(methodName + " : " +sb.toString());
    }


    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] target) {
        int length = target.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (target[j] > target[j + 1]) {
                    int temp = target[j];
                    target[j] = target[j + 1];
                    target[j + 1] = temp;
                }
            }
        }

    }

    /**
     * 选择排序s
     */
    public static void selectSort(int[] target) {
        int length = target.length;
        for (int i = 0; i < length; i++) {
            int minV = target[i];
            for (int j = i; j < length; j++) {
                if (target[j] < minV) {
                    int temp = target[j];
                    target[j] = minV;
                    minV = temp;
                }
            }
            target[i] = minV;
        }

    }

    /**
     * 插入排序
     */
    public static void insertSort(int[] target) {
        int length = target.length;
        for (int i = 0; i < length; i++) {
            int minV = target[i];
            for (int j = i; j < length; j++) {
                if (target[j] < minV) {
                    int temp = target[j];
                    target[j] = minV;
                    minV = temp;
                }
            }
            target[i] = minV;
        }

    }

    public void function(List<List<Integer>> dataList, int[] nums, List<Integer> list){
        if(list.size() == nums.length){
            dataList.add(list);
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(list.contains(nums[i])){
                continue;
            }
            list.add(nums[1]);
            function(dataList,nums,list);
           // remove(list.remove(list.size()-1));
        }
    }

}
