package com.teksystems;

public class Day1 {


    public static void main(String[]args){

        int seconds = 86399;
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;

        System.out.println(p2 + ":" + p3 + ":" + p1);
        System.out.println("\n");


    }
}
