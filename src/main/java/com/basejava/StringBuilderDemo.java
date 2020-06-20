package com.basejava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 云路供应链科技有限公司 版权所有 © Copyright 2019<br>
 *
 * @Description: </br>
 * @Project: </br>
 * @CreateDate: Created in 2020-06-12 10:14 </br>
 * @Author: <a href="624976130@qq.com">dengyaguo</a>
 */
public class StringBuilderDemo {

    public static void main(String[] args) {
//        StringBuilder stringBuilder = new StringBuilder("123");
//        String s = null;
//        stringBuilder.append(s);
//        String s1 = null;
//        stringBuilder.append(s1);
//        stringBuilder.append("456");
//        System.out.println(stringBuilder.toString());
         List<String> list = new ArrayList<>();
        List<String> collect = list.stream().filter(s -> s.equals("")).collect(Collectors.toList());

    }
}
