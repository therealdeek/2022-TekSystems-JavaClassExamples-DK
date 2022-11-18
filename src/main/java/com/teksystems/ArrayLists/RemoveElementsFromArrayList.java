package com.teksystems.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {
    public static void main(String[] args) {

        List<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Intial List: " + programmingLanguages);

        //remove the element at index 5

        programmingLanguages.remove(5);
        System.out.println("After removing 5: " + programmingLanguages);

        //remove the first occurrence of the given element from the arraylist
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After removing (\"Kotlin\"): " + programmingLanguages);

        //remove all the elements that exist in a given collection

        List<String> scriptingLanguages = new ArrayList<>();

        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removing scripting languages): " + programmingLanguages);

        // remove all elements from the ArrayList
        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);
    }
}
