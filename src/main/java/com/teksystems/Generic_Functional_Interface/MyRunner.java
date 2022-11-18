package com.teksystems.Generic_Functional_Interface;

public class MyRunner {
    public static void main(String[] args) {
        MyComparingClass compareObj = new MyComparingClass();
        int resultInteger = compareObj.compareTwoVar.compare(55, 50);
        System.out.println(resultInteger);

        String resultString = compareObj.stCompare.compare("A", "a");
        System.out.println(resultString);
    }
}
