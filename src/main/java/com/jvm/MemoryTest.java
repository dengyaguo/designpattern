package com.jvm;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * import  [jol-core 包]
 */
public class MemoryTest {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        String o = new String();
        HashMap<Object, Object> hashMap = new HashMap<>();
        arrayList.add(o);
        arrayList.add(hashMap);
        Set<Class<?>> classes = GraphLayout.parseInstance(arrayList).getClasses();
        for (Class<?> aClass : classes) {
            System.out.println(aClass);
        }
        System.out.println("查看对象内部信息: " + ClassLayout.parseInstance(o).toPrintable());
        System.out.println("查看对象外部信息：包括引用的对象：" +GraphLayout.parseInstance(o).toPrintable());
        System.out.println("对象内存大小：" + GraphLayout.parseInstance(o).totalSize()/1024/1024);
    }

}
