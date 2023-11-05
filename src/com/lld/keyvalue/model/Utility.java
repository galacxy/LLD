package com.lld.keyvalue.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Utility {
    private static final String WHITESPACE = " ";
    public static Pair<String, Map<String, Object>> validateFormat(String input, Set<?> storeKeys){
        if (input == null || input.isEmpty()){
            return null;
        }

        String[] tokens = input.split(WHITESPACE);

        if (tokens.length%2 == 1 || tokens.length < 4){
            return null;
        }
        return validateKeys(tokens,storeKeys);
    }

    private static Pair<String, Map<String, Object>> validateKeys(String[] tokens, Set<?> storeKeys){
        Map<String, Object> value = null;
        if (storeKeys == null) {
            return null;
        }
        if (storeKeys.isEmpty()){
            value = new HashMap<>();
            for(int i=2;i<tokens.length;i+=2){
                value.put(tokens[i], parseValueType(tokens[i+1]));
            }
        } else {
            value = validateWithStoreKeys(tokens, storeKeys);
        }
        return new Pair<>(tokens[1], value);
    }

    private static Object parseValueType(String data){
        try {
            return  Integer.parseInt(data);
        } catch (NumberFormatException ne){
            try {
                return Double.parseDouble(data);
            } catch (NumberFormatException ne1){
                if ("true".equals(data) || "false".equals(data)){
                    return Boolean.parseBoolean(data);
                }
                return data;
            }
        }
    }

    private static Map<String, Object> validateWithStoreKeys(String[] tokens,Set<?> storeKeys){
        Map<String, Object> value = new HashMap<>();
        int count = 0;
        for (int i = 2; i < tokens.length; i += 2) {
            if (storeKeys.contains(tokens[i])) {
                value.put(tokens[i], tokens[i + 1]);
                count++;
            } else {
                return null;
            }
        }
        return storeKeys.size() == count ? value : null;
    }
}
