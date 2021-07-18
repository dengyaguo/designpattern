package com.jvm;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * import  [jol-core 包]
 */
public class MemoryTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Object> arrayList = new ArrayList<>();
        String o = "abc";
        System.out.println(o.hashCode());
        System.out.println("查看对象内部信息: " + ClassLayout.parseInstance(o).toPrintable());
        System.out.println("查看对象外部信息：包括引用的对象：" +GraphLayout.parseInstance(o).toPrintable());
        /*          System.out.println("对象内存大小：" + GraphLayout.parseInstance(o).totalSize()/1024/1024);*/
        TimeUnit.SECONDS.sleep(50000);

        System.out.println("我的天空 ");
        System.out.println("天空之城在哭泣 ");

        System.out.println("cherry -pick ");
    }

}
