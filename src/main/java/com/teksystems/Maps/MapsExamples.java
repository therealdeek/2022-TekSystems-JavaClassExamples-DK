package com.teksystems.Maps;

import java.util.*;

public class MapsExamples {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("position 0");
        list.add("position 0");
        list.add("position 0");
        list.add("position 0");
        list.add("position 0");
        list.add("position 0");

        Set<String> set1 = new HashSet<>();

        set1.add("position 0");
        set1.add("position 0");
        set1.add("position 0");
        set1.add("position 1");

        printList(set1, list);

        HashMap<String, Integer> hm1 = new HashMap<>();

        hm1.put("Erica", 100);
        hm1.put("Davina", 95);
        hm1.put("Stan", 88);

        printListOfMap(hm1);

        /*
        / a hashmap is a key value pair
        HashMap<String,String> map = new HashMap<>();
        //      key   , value
        map.put("eric", "Eric Heilig");
        map.put("londen", "Londen Haskins");

        System.out.println(map.get("eric"));
        System.out.println(map.get("londen"));
        // someone does not exist in map as a key, so it returns null;
        System.out.println(map.get("someone"));

        System.out.println( "############################");
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("eric", 100);
        grades.put("joe", 90);
        System.out.println(grades.get("eric"));
        System.out.println(grades.get("joe"));

        // map of menu items

        HashMap<String,MenuItem> menuItems = new HashMap<>();
        menuItems.put("lemonade", new MenuItem("lemonade", "drink", 0.85));
        menuItems.put("juice", new MenuItem("cranberry juice", "drink", 3.36));
        // at this point the juice will be cranberry
        System.out.println("1) Item name is " + menuItems.get("juice").getItem());

        // now we add another menu item with the same key .. which overwrites cranberry with apple
        menuItems.put("juice", new MenuItem("apple juice", "drink", 2.36));

        MenuItem item1 = menuItems.get("juice");
        System.out.println("2) Item name is " + item1.getItem());

        MenuItem item = menuItems.get("lemonade");
        System.out.println("3) Item name is " + item.getItem());

*/

    }

    public static void printList(Set<String> set1, List<String> list) {

        System.out.println("=========Set=========");
        for (String s : set1) {
            System.out.println(s);
        }

        System.out.println("=========List=========");

        for (String a : list) {
            System.out.println(a);
        }
    }

    public static void printListOfMap(HashMap<String, Integer> hm1) {
        System.out.println("===========Hash Map Example===========");

        for (Map.Entry<String, Integer> entry: hm1.entrySet()) {
            System.out.println(entry);
        }
    }
}
