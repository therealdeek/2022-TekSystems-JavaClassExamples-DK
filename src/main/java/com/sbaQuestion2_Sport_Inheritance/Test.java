package com.sbaQuestion2_Sport_Inheritance;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cricket c = new Cricket();
        Football f = new Football();

        int[] age1 = new int[11];
        int[] age2 = new int[11];

        for (int i = 0; i < 2; i++) {
            String[] age = sc.nextLine().split(" ");
            if (i == 0) {
                int j = 0;
                for (String s : age)
                    age1[j++] = Integer.parseInt(s);
            } else {
                int j = 0;
                for (String s : age)
                    age2[j++] = Integer.parseInt(s);
            }
        }
        // these method we are defined in interface and implement  interface into cricket class and now we are just createing a object of cricket class
        //and calling method of interface

        c.calculateAvgAge(age1);
        f.calculateAvgAge(age2);

        for (int i = 0; i < 6; i++) {

            if (i < 3) {
                int x = Integer.parseInt(sc.nextLine());

                c.retirePlayer(x);
            } else if (i < 5) {
                int x = Integer.parseInt(sc.nextLine());
                f.retirePlayer(x);
            } else {
                String[] temp = sc.nextLine().split(" ");
                f.playerTransfer(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            }

        }
    }
}
