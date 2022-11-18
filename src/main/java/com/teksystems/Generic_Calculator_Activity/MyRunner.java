package com.teksystems.Generic_Calculator_Activity;

public class MyRunner {
    public static void main(String[] args) {
        MainEntry mainObj = new MainEntry();

        int additionMethod = mainObj.add(5, 9);
        System.out.println(additionMethod);

        int subtractionMethod = mainObj.subtract(4, 8);
        System.out.println(subtractionMethod);

        int multiplyMethod = mainObj.multiply(4, 12);
        System.out.println(multiplyMethod);

        int divideMethod = mainObj.divide(5, 25);
        System.out.println(divideMethod);

    }
}
