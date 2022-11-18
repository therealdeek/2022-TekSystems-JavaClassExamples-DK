package com.teksystems;

import java.util.Scanner;
import java.util.*;

public class Day2 {

    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Please enter in your BMI: ");

        int bmi = sc.nextInt();

        if (bmi >= 30) {
            System.out.println("This person is obese");
        } else if (bmi >= 25) {
            System.out.println("This person is overweight");
        } else if (bmi >= 18.5) {
            System.out.println("This person is normal");
        } else {
            System.out.println("This person is underweight");
        } */


        /* Scanner sc = new Scanner(System.in);
        System.out.println("Please enter in year: ");

        int year = sc.nextInt();

        if((year % 4 == 0) && (year % 400 == 0) && (year / 100 != 0) ){
            System.out.println("This is a leap year");
        }else{
            System.out.println("This is not a leap year");
        } */

       /* long n = 461012;
        System.out.format("%d %n", n);
        System.out.format("%08d%n", n);
        System.out.format("%+8d%n", n);
        System.out.format("%,8d%n", n);
        System.out.format("%+,8d%n%n", n);

        int i = 1024;
        byte b = 127;
        double d = 1.232, tiny = d / 1000000.0;
        boolean bool = true;
        System.out.format(" This is an integer: %d and this is a byte: %d.\r\n", i, b);
        System.out.format(" This is a double: %.4f and this is tiny: %.4e.\r\n", d, tiny);
        System.out.format(" And this is a String: %s", "This is a string.\r\n");
*/

        /* System.out.println("------------------------");
        String data = "Hello World!";
        System.out.printf("Printing a string: %s\n", data);
        System.out.printf("Printing a string in uppercase: %S\n", data);
        int x = 100;
        System.out.printf("Printing a decimal integer: %d\n", x);
        int hours = 100;
        double days = 100/24.0; // used 24.0 to avoid integer division
        System.out.print("days: ");
        System.out.printf("%.3f",days);
        // -------- Specifying Width --------
        System.out.printf("%-10.2f%n", 18.0); // left aligned: -
        System.out.printf("%10.2f%n", 20.0); // right aligned
        System.out.printf("%10.3f", 10.2); // no text
        System.out.printf("%n"); // only %n
        System.out.printf("%10.2f%5d%n", 15.7,3); // no text and %n
        System.out.printf("%10.2f%d%n", 15.7,3); // no space before 3
        System.out.printf("%10.2f", 15.7);
        System.out.printf("%n%10.2f%n%5d%n", 11.3,8);
        // --- mix different data types --------------
        System.out.printf("%s is %d years old","Jane", 23);    }
*/

        /* int a = 10, b = -20;
        System.out.println(Math.abs(a)); // 10
        System.out.println(Math.abs(b)); // 20
        System.out.println(Math.max(a, b)); // 10
        System.out.println(Math.min(a, b)); // -20 */

        /*
        double x = 28;
        double y = 4;


        // return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));
        //returns 28 power of 4 i.e. 28*28*28*28
        System.out.println("Power of x and y is: " + Math.pow(x, y));
        // return the logarithm of given value
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));
        // return the logarithm of given value when base is 10
        System.out.println("log10 of x is: " + Math.log10(x));
        System.out.println("log10 of y is: " + Math.log10(y));

        // return the log of x + 1
        System.out.println("log1p of x is: " +Math.log1p(x));

        // return a power of 2
        System.out.println("exp of x is: " +Math.exp(x));

        double d = 83.67;
        System.out.println(Math.ceil(d));  // return double & rounded up to its nearest integer
        System.out.println(Math.floor(d)); // return double and rounded down to its nearest integer
        System.out.println(Math.rint(d)); // return double but find the closest integers for these double numbers
        //Math.round() It is used to round of the decimal numbers to the nearest value.
        System.out.println(Math.round(d));  // 84;
        double a = 1.878;
        System.out.println(Math.round(a));  // 2
        // value equals to 5 after decimal
        double b = 1.5;
        System.out.println(Math.round(b));  // 2
        // value less than 5 after decimal
        double c = 1.34;
        System.out.println(Math.round(c));  // 1

        // declare max and min
        int min = 100;
        int max = 1000;

        // calculate range
        int range = (max-min) + 1;

        // generate floating-point number b/w 100 to 1000
        double d1 = Math.random()*range + min;

        // generate integer number b/w 100 to 1000
        int n1 = (int)(Math.random()*range + min);

        // display result
        System.out.println(d1);
        System.out.println(n1);
        */



        /*
        HackerRank Java Strings Introduction Problem 1
         */
        /* Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.println(a.length() + b.length());

        if(a.charAt(0) > b.charAt(0)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.println(a.substring(0,1).toUpperCase() + a.substring(1)
                + " " + b.substring(0,1).toUpperCase() + b.substring(1));

    } */

        /*
        HackerRank Java Substring Problem 2
         */

       /* Scanner in = new Scanner(System.in);
        System.out.println("Please enter in your string: ");

        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end)); */



    }
}

