package com.lld.keyvalue.model;

public class Pair<K,V>{
    private final K key;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    private final V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
