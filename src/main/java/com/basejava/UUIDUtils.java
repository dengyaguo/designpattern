package com.basejava;

import cn.hutool.core.util.IdUtil;

public class UUIDUtils {

    public static void main(String[] args) {
        String randomUUID = IdUtil.randomUUID();
        String simpleUUID = IdUtil.simpleUUID();

        System.out.println(randomUUID);
        System.out.println(simpleUUID);
    }
}
