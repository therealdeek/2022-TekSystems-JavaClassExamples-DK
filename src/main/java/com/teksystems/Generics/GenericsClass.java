package com.teksystems.Generics;

import java.util.*;

public class GenericsClass {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list.add("Str1");
        list.add("Str2");
        list.add("Str3");

        list2.add("Str4");
        list2.add("Str5");
        list2.add("Str6");

        printlist(list2);

        list.addAll(list2);

        printlist(list);

        printlist(list2);

        String a = list.get(3);
        System.out.println("a = " + a);

        //contains

        if (list.contains("Str1")) {
            System.out.println("List contains String 1");
        }

        list.add(1, "Str10");
        printlist(list);

        String[] arr = new String[5];
        arr[0] = "hello";
        arr[1] = "my";
        arr[2] = "name";
        arr[3] = "is";

        List<String> listObj = Arrays.asList(arr);
        printlist(listObj);

        }
        public static void printlist(List<String> list) {
        System.out.println("====================");

        //Iterator can be used in place of the for each loop
        /* Iterator<String> it = list.listIterator();
            while (it.hasNext()) {
                System.out.println(it);
            } */

        for (String s : list) {
            System.out.println(s);
        }

    }
}
