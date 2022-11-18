package com.teksystems.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class SearchingElementsInArrayListExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("David");
        names.add("Sam");
        names.add("Tina");
        names.add("Toni");

        //Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"John\"? : " +
                names.contains("John"));

        //Find the index of the first occurrence of an element in an ArrayList
        System.out.println("indexOf \"David\": " + names.indexOf("David"));
        System.out.println("indexOf \"Sam\": " + names.indexOf("Sam"));

        //Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf \"Tina\": " + names.lastIndexOf("Tina"));
        System.out.println("lastIndexOf \"Toni\": " + names.lastIndexOf("Toni"));
    }
}
