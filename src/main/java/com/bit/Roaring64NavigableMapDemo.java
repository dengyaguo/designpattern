package com.bit;

import org.openjdk.jol.info.GraphLayout;
import org.roaringbitmap.RoaringBitmap;

public class Roaring64NavigableMapDemo {

    public static void main(String[] args) {

/*        RoaringBitmap roaringBitmap = new RoaringBitmap();
        for (int i = 0; i < 999999999; i++) {
            roaringBitmap.add(i);
        }
        int cardinality = roaringBitmap.getCardinality();
        System.out.println(cardinality);
        System.out.println("内存" + roaringBitmap.getSizeInBytes() / 1024 / 1024);
        System.out.println("对象内存大小：" + GraphLayout.parseInstance(roaringBitmap).totalSize() / 1024 / 1024);


        Roaring64NavigableMap roaring64NavigableMap = new Roaring64NavigableMap();
        for (int i = 0; i < 999999999; i++) {
            roaring64NavigableMap.add(i);
        }
        System.out.println("内存" + roaring64NavigableMap.getSizeInBytes() / 1024 / 1024);
        System.out.println("对象内存大小：" + GraphLayout.parseInstance(roaring64NavigableMap).totalSize() / 1024 / 1024);*/

//        999999999
//        内存119
//        对象内存大小：119
//        内存119
//        对象内存大小：119


        RoaringBitmap rbm = new RoaringBitmap();
        for (int i = 0; i < 999999999; i++) {
            rbm.add(i);
        }
        int size = rbm.getCardinality();
        System.out.println("内存" + rbm.getSizeInBytes());
        System.out.println("对象内存大小：" + GraphLayout.parseInstance(rbm).totalSize());
        boolean flag = rbm.runOptimize();
        System.out.println(size);
        System.out.println("内存" + rbm.getSizeInBytes());
        System.out.println("对象内存大小：" + GraphLayout.parseInstance(rbm).totalSize());

    }
}
