package com.util;

import java.util.ArrayList;
import java.util.concurrent.atomic.LongAdder;

public class DemoVo<T,V> {
    public DemoVo() {
    }
    public DemoVo(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }


    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    private T key;
    private V value;

    public static void main(String[] args) {
        DemoVo<Object, Object> vo = new DemoVo<>("KEY", "VALUE");
        Object key = vo.getKey();
        Object value = vo.getValue();

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(null);

        LongAdder preCostFailMonitor = new LongAdder();
        preCostFailMonitor.increment();
        System.out.println(preCostFailMonitor.longValue());
    }
}
