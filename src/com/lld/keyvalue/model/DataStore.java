package com.lld.keyvalue.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataStore<K,V> extends HashMap<K,V> {
    private final EvictionStrategy<Map<String ,Object>> evictionStrategy;
    private final int capacity;

    public DataStore(EvictionStrategy<Map<String ,Object>> evictionStrategy, int capacity) {
        this.evictionStrategy = evictionStrategy;
        this.capacity = capacity;
    }

    public Set<K> getValueKeys(){
        return this.keySet();
    }

    public List<V> search(String key){
        return List.of();
    }
}
