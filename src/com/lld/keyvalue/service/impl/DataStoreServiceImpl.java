package com.lld.keyvalue.service.impl;

import com.lld.keyvalue.model.DataStore;
import com.lld.keyvalue.model.EvictionStrategy;
import com.lld.keyvalue.model.Pair;
import com.lld.keyvalue.model.Utility;
import com.lld.keyvalue.service.DataStoreService;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataStoreServiceImpl implements DataStoreService<String, Map<String, Object>> {

    private DataStore<String, Map<String, Object>> dataStore;

    public DataStoreServiceImpl(){
        this.dataStore = new DataStore<>(new EvictionStrategy<>(), 100);
    }

    @Override
    public boolean put(String input) {
        if (dataStore == null){
            return false;
        }
        Pair<String, Map<String, Object>> parsedData = Utility.validateFormat(input, dataStore.getValueKeys());
        if (parsedData == null){
            return false;
        }

        return dataStore.put(parsedData.getKey(), parsedData.getValue()) != null;
    }

    @Override
    public Map<String, Object> get(String key) {
        return dataStore.get(key);
    }

    @Override
    public Set<String> keys() {
        return dataStore.keySet();
    }

    @Override
    public boolean delete(String key) {
        return dataStore.remove(key) == null;
    }

    @Override
    public List<Map<String, Object>> search(String key) {
        return dataStore.search(key);
    }
}
