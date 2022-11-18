package com.teksystems.Maps;

import java.util.HashMap;

public class ExamplesTwoHashMap {
    public static void main(String[] args) {
        HashMap<String, String> newHashMap = new HashMap<>();

        newHashMap.put("Key 1", "Lenovo");
        newHashMap.put("Key 2", "Motorola");
        newHashMap.put("Key 3", "Nokia");
        newHashMap.put("Key 4", null);
        newHashMap.put(null, "Sony");

        System.out.println("Original map contains: " + newHashMap);
        System.out.println("Size of original Map is: " + newHashMap.size());

        //copy one HashMap to another
        HashMap<String, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(newHashMap);
        System.out.println("copyHashMap mappings = " + copyHashMap);
        //removal of null key
        String nullKeyValue = copyHashMap.remove(null);
        System.out.println("copyHashMap null key value = " + nullKeyValue);
        System.out.println("copyHashMap after removing null key = " + copyHashMap);
        System.out.println("Size of copyHashMap is:" + copyHashMap.size());
    }

}

