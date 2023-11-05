package com.lld.keyvalue.service;

import java.util.List;
import java.util.Set;

public interface DataStoreService<K,V> {
    boolean put(String input);
    V get(String key);
    Set<K> keys();
    boolean delete(String key);
    List<V> search(String key);
}
