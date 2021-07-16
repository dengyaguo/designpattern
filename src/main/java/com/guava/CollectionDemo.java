package com.guava;

import com.google.common.collect.*;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * guava demo
 */
public class CollectionDemo {
    public static void main(String[] args) {
        CollectionDemo test = new CollectionDemo();
        test.test1();
        test.test2();

        System.out.println(
                "master 23:30"
        );

    }


    /**
     *  无序+可重复
     *  map结构：value为key出现总数
     */
    public void test1(){
        Multiset<String> set = HashMultiset.create();
        set.add(null);

    }

    /**
     * Multimap: key-value  key可以重复
     */
    public void test2(){
        Multimap<String, String> teachers = ArrayListMultimap.create();
        teachers.put(null,null);
        Map<String, Collection<String>> stringCollectionMap = teachers.asMap();
    }


    /**
     * 双向map
     */
    public void test3(){
        HashBiMap<Object, Object> biMap = HashBiMap.create();
        biMap.put("key1","value1");
        biMap.put("key2","value2");
        Object key1 = biMap.get("key1");
        System.out.println(key1);
        Object value1 = biMap.inverse().get("value1");
        System.out.println(value1);
    }

    /**
     * 多key  map  ，和redis的hash结构差不多
     */
    public void test4(){
        Table<Object, Object, Object> basedTable = HashBasedTable.create();
        basedTable.put("row1","column1","value1");
        basedTable.put("row2","column2","value3");
        Set<Table.Cell<Object, Object, Object>> cells = basedTable.cellSet();
        for (Table.Cell<Object, Object, Object> next : cells) {
            Object rowKey = next.getRowKey();
            Object columnKey = next.getColumnKey();
            Object value = next.getValue();
            System.out.println(rowKey + "-" + columnKey + "-" + value);
        }
    }


}
