package com.lld.keyvalue.service.impl;

import com.lld.keyvalue.service.DataStoreService;
import com.lld.keyvalue.service.DataStoreWrapper;

import java.util.Map;

public class DataStoreWrapperImpl implements DataStoreWrapper {
    private final DataStoreService<String, Map<String, Object>> dataStoreService;

    public DataStoreWrapperImpl(){
        this.dataStoreService = new DataStoreServiceImpl();
    }

    @Override
    public void performOperation(String input){
        if (input == null || input.isEmpty()){
            System.out.println("Invalid input");
            return;
        }
        String[] tokens = input.split(" ");
        switch (tokens[0]){
            case "put" :
                System.out.println(dataStoreService.put(input));
                break;
            case "get":
                System.out.println(dataStoreService.get(tokens[1]));
                break;
        }
    }
}
