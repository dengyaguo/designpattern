package com.guava;

import com.google.common.collect.*;

import java.util.*;

/**
 * guava demo
 */
public class CollectionDemo {
    public static void main(String[] args) {
        CollectionDemo test = new CollectionDemo();
        test.test1();
        test.test3();
        test.test4();

    }


    /**
     * 无序+可重复
     * map结构：value为key出现总数
     */
    public void test1() {
        Multiset<String> hashMultiset = HashMultiset.create();
        hashMultiset.add("111");
        hashMultiset.add("111");
        //允许重复元素并计算重复的次数
        System.out.println("hashMultiset:" + hashMultiset.count("111"));

        //插入快
        Multimap<String, String> teachers = ArrayListMultimap.create();
        teachers.put(null, null);
        Map<String, Collection<String>> stringCollectionMap = teachers.asMap();
        final Collection<String> strings1 = stringCollectionMap.get(null);

        //查找快
        final HashMultimap<String, String> hashMultimap = HashMultimap.create();
        hashMultimap.put(null, null);
        final Set<String> strings = hashMultimap.get(null);


        //折中  查找和插入
        final LinkedHashMultimap<String, String> linkedHashMultimap = LinkedHashMultimap.create();
        linkedHashMultimap.put("1", "3");
        linkedHashMultimap.put("1", "1");
        linkedHashMultimap.put("1", "2");
        final Map<String, Collection<String>> objectCollectionMap = linkedHashMultimap.asMap();
        for (Map.Entry<String, Collection<String>> stringCollectionEntry : objectCollectionMap.entrySet()) {
            System.out.println("linkedHashMultimap:" + stringCollectionEntry.getKey() + "   " + stringCollectionEntry.getValue());
        }

        //有序可以定义排序规则
        final TreeMultimap<Long, String> treeMultimap = TreeMultimap.create();
        treeMultimap.put(1L, "11");
        treeMultimap.put(1L, "1");
        treeMultimap.put(3L, "3");
        treeMultimap.put(2L, "2");
        treeMultimap.put(1L, "111");

        for (Map.Entry<Long, String> entry : treeMultimap.entries()) {
            System.out.println("treeMultimap:" + entry.getKey() + "   " + entry.getValue());
        }
    }


    /**
     * 双向map
     */
    public void test3() {
        HashBiMap<Object, Object> biMap = HashBiMap.create();
        biMap.put("key1", "value1");
        biMap.put("key2", "value2");
        Object key1 = biMap.get("key1");
        System.out.println(key1);
        Object value1 = biMap.inverse().get("value1");
        System.out.println(value1);
    }

    /**
     * 多key  map  ，和redis的hash结构差不多
     */
    public void test4() {
        Table<Object, Object, Object> basedTable = HashBasedTable.create();
        basedTable.put("row1", "column1", "value1");
        basedTable.put("row2", "column2", "value3");
        Set<Table.Cell<Object, Object, Object>> cells = basedTable.cellSet();
        for (Table.Cell<Object, Object, Object> next : cells) {
            Object rowKey = next.getRowKey();
            Object columnKey = next.getColumnKey();
            Object value = next.getValue();
            System.out.println(rowKey + "-" + columnKey + "-" + value);
        }
    }


}
