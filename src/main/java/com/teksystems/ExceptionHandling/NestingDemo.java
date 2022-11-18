package com.teksystems.ExceptionHandling;

import java.util.Arrays;

public class NestingDemo {
    public static void main(String[] args) {

        try {

            try {

                try {
                    int arr[] = {1, 2, 3, 4};
                    System.out.println(arr[10]);

                } catch (ArithmeticException e) {
                    System.out.print("Arithmetic exception");
                    System.out.println(" Handled in 3rd try block");

                }
            } catch (ArithmeticException e) {
                System.out.print("Arithmetic exception");
                System.out.println(" Handled in 2nd try block");
            }
        } catch (ArithmeticException e3) {
            System.out.print("Arithmetic exception");
            System.out.println(" Handled in 1st try block");
        } catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print("ArrayIndexOutOfBoundsException");
            System.out.println(" Handled in 1st try block");
        } catch (Exception e5) {
            System.out.println("Exception");
            System.out.println(" Handled in 1st try block");

        }
    }
}
