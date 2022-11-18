package com.teksystems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Day4 {

    public static final double INCREASE_PERCENTAGE = 1.07;
    private static String[] days = {"Mon", "Tues", "Wed", "Thurs", "Fri"};
    private double[] values = new double[10];

    public static void main(String[] args) {

     /*   System.out.println("Before" + Arrays.toString(days));
        Arrays.sort(days);
        System.out.println("After" + Arrays.toString(days));

        System.out.println("==============================");

        // clone() method is inherited from Object class
        int[] sourceArray = {1, 2, 3};
        int[] targetArray = sourceArray.clone();
        sourceArray[2] = 500;

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Target Array: " + Arrays.toString(targetArray));

        System.out.println("================================");

        int[] sourceArrays = {2, 3, 4, 5, 10};
        int[] targetArrays = new int[sourceArrays.length];

        for (int i = 0; i < sourceArrays.length; i++) {
            targetArrays[i] = sourceArrays[i];
        }
        System.out.println(Arrays.toString(sourceArrays));
        System.out.println(Arrays.toString(targetArrays));
        if (targetArrays == sourceArrays) {
            System.out.println("Same instance");
        } else {
            System.out.println("Different instance");
            System.out.println("===========================");

        } */

        /*

        //Multiplication Table
        for (int row = 1; row <= 12; row++) {
            for (int column = 1; column <= 12; column++) {
                int value = row * column;

                System.out.print(value + "\t");

            }
            System.out.println("");
        } */

        /*
        Tuition amoritization program
         */

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Please enter in your tuition amount: ");
        System.out.println();

        int tuition = sc.nextInt();
        double futureTuition = tuition;
        int year = 0;

        System.out.println("Year \t Tuition");

        while (futureTuition <= tuition * 2) {
            futureTuition *= INCREASE_PERCENTAGE;
            year++;

            System.out.println(year + "\t tuition = " + futureTuition);

        } */

        //class ArraySort {

       /* int[] sort = {10, 2, 99, 4, 3, 2, 1, 5, 7, 8};
        for (int i = 0; i < sort.length; i++) {
            System.out.println(Arrays.toString(sort));
        }

        // write some code that will sort this array from smallest to largest
        // use more than 1 loop
        // compare the element at location i and i + 1
        // make a decision and swap the 2 elements if necessary
        // make sure you are checking boundary conditions

        int temp;

        int j;
        for (int i = 0; i < sort.length; i++) // i is 10 {
            for (j = i; j < sort.length; j++) //j is 2 {
                if (sort[i] > sort[j]) {
                    temp = sort[i]; //temp equals the largest element sort for the time being
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
        for (int x : sort) {
            System.out.print((x));
        } */


        // normal star pattern
       /* for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } */

        //upside down star pattern
      /* for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } */

        // reverse star pattern
       /* for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } */

        // 4 row/ 10 column star pattern
        /* for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

       /* for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } */

        //Hill pattern for loop

       /* int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            } */


        // Number pyramid loop pattern
      /*  int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(i+ " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        } */


        // Number pyramid loop pattern two

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(i+ " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

            }

    }




        










