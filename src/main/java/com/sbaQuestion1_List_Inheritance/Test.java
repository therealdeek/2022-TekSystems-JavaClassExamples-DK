package com.sbaQuestion1_List_Inheritance;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InvalidStringException {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random(0);

        int n = Integer.parseInt(sc.nextLine());
        String[] a = new String[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextLine();

        MyList obj = new ArrayToList();

        obj.convert(a);
        int x = rand.nextInt(n);
        for (int i = 0; i < x; i++) {
            obj.replace(rand.nextInt(n));
        }

        ArrayList<String> s = obj.compact();

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).charAt(0) >= 97 && s.get(i).charAt(0) <= 122) {
                try {
                    throw new InvalidStringException("\nThis is an invalid string");
                } catch (InvalidStringException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }
}
