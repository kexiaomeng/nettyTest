package com.tracy.redis;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 模拟最近未使用缓存算法
 * @param <K>
 * @param <V>
 */
public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private long capacity;
    public LRUCache(long capacity) {

        super((int)capacity, 0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > capacity;
    }


    public static void main(String args[]) {
        LRUCache<String, Object> cache = new LRUCache<>(3);

        cache.put("1",1);
        cache.put("2",2);
        cache.put("3",3);
        cache.get("1");
        cache.put("4","嘀嘀嘀");

        System.out.println(cache); // 输出为：{c=call, a=abstract, d=滴滴滴}

    }
}
