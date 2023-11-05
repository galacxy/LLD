package com.lld.keyvalue;

import com.lld.keyvalue.service.DataStoreWrapper;
import com.lld.keyvalue.service.impl.DataStoreWrapperImpl;

public class Main {

    public static void main(String[] args) {
        DataStoreWrapper service = new DataStoreWrapperImpl();
        service.performOperation("put sde_bootcamp title SDE-Bootcamp price 30000.00 enrolled false estimated_time 30");
        service.performOperation("get sde_bootcamp");
    }
}
