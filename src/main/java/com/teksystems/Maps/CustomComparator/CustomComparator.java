package com.teksystems.Maps.CustomComparator;

import java.util.Comparator;
import java.util.TreeMap;

public class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String number1, String number2) {
        int value = number1.compareTo(number2);

        if (value > 0) {
            return -1;
        } else if (value < 0) {
            return 1;

        }else{
            return 0;
        }
    }

}

