package com.teksystems.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNums = new ArrayList<>();

        firstFivePrimeNums.add(2);
        firstFivePrimeNums.add(3);
        firstFivePrimeNums.add(5);
        firstFivePrimeNums.add(7);
        firstFivePrimeNums.add(11);

        //Creating an ArrayList from another collection

        List<Integer> firstTenPrimeNums = new ArrayList<>(firstFivePrimeNums);

        List<Integer> nextFivePrimeNums = new ArrayList<>();

        nextFivePrimeNums.add(13);
        nextFivePrimeNums.add(17);
        nextFivePrimeNums.add(19);
        nextFivePrimeNums.add(23);
        nextFivePrimeNums.add(29);

        //Adding an entire collection to an ArrayList

        firstTenPrimeNums.addAll(nextFivePrimeNums);

        System.out.println(firstTenPrimeNums);

    }
}
