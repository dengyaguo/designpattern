package com.bit;

import org.openjdk.jol.info.GraphLayout;
import org.roaringbitmap.RoaringBitmap;
import org.roaringbitmap.longlong.Roaring64NavigableMap;

public class BitMapTest {

    public static void main(String[] args) {

        System.out.println(93750000*64);
        System.out.println(15625000*64);
        //1000000000
        // 999999999
        System.out.println( Runtime.getRuntime().maxMemory()/1024/1024 + "  totalMemory "+Runtime.getRuntime().totalMemory()/1024/1024 + "：before 空闲内存大小：" + Runtime.getRuntime().freeMemory()/1024/1024);
        MyLongMap bitMap = new MyLongMap();
        System.out.println( Runtime.getRuntime().maxMemory()/1024/1024 + "  totalMemory "+ Runtime.getRuntime().totalMemory()/1024/1024 + "：before 空闲内存大小：" +  Runtime.getRuntime().freeMemory()/1024/1024);

        //9999999999999
        for (long i = 999991000l; i < 999999999l; i++) {
            try {
                bitMap.add(i);
            } catch (Exception e) {
                System.out.println("错误:" + i);
            }
        }
        System.out.println( Runtime.getRuntime().maxMemory()/1024/1024 + "  totalMemory "+ Runtime.getRuntime().totalMemory()/1024/1024 + "：before 空闲内存大小：" +  Runtime.getRuntime().freeMemory()/1024/1024);

        long start = System.currentTimeMillis();
        boolean contains = bitMap.contains(999999999);
        System.out.println(contains+ " 耗时 "+(System.currentTimeMillis()-start));

        System.out.println("对象内存大小：" + GraphLayout.parseInstance(bitMap).totalSize()/1024/1024);
    }
}
