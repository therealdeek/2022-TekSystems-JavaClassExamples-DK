package com.teksystems.FunctionalProgramming2;

public class MyRunner {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int result_AbstractMethod = c.Fobj.sum(5, 5);
        System.out.println("Result Abstract method " + result_AbstractMethod);

        int result_defaultMethod = c.Fobj.multiply(5, 5);
        System.out.println("Result Default method " + result_defaultMethod);

    }
}
