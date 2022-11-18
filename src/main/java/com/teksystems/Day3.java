package com.teksystems;

import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {
        //exampleFunction();
        //newFunction();
        // whileLoop();

        System.out.println("========================");
        breakContinue();

        /* for(int i = 5; i <= 100; i+=5){

            System.out.println("The numbers divisible by 5 are: " + i);
            */

       /*  String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        } else {
            System.out.println("Entered string/number isn't a palindrome.");
        } */


    }

    /* public static void whileLoop(){
        boolean exit = true;
        int counter = 10;

        while (exit) {
            counter +=1;
            System.out.println("This is cool " + counter);
            break;

        }
    } */


   /* public static void exampleFunction(){
        for(int i = 5;i <= 100; i+=5){

            System.out.println("Hello World " + i);
        }

    }
    public static void newFunction(){
        for(int i = 10; i > 0; i--){
            System.out.println("This is the newFunction method "
                    + "Hello World " + i);
            break;

        }
    } */


    /*
    try to change this so that....any odd number will continue
    if i+ 4 then print the message and then break the loop
    actual output should be 2 and 4
     */
    public static void breakContinue() {
        System.out.println("Starting the loop");
        for (int i = 1; i <= 5; i++) {
            if (i == 5) {
                break;
            }
            if (i == 1 || i == 3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Ending the loop");
    }
}


