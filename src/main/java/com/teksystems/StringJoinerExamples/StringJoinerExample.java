package com.teksystems.StringJoinerExamples;

import java.util.StringJoiner;

public class StringJoinerExample {


    public static void main(String[] args) {

    /*    String name1 = "Hello";
        String name2 = "World";
        String name3 = "Java";
        String name4 = "Rocks";

        //after StringJoiner Hello, World, Java, Rocks

        StringJoiner joiner = new StringJoiner("%$#", "(", "]");

        StringBuffer sb = new StringBuffer(name1);


        joiner.add(name1);
        joiner.add(name2);
        joiner.add(name3);
        joiner.add(name4);

        System.out.println(sb.reverse());
        System.out.println(sb.insert(2, "Hi"));

        System.out.println(joiner.toString());
        System.out.println("=======================");

        StringJoiner sj1 = new StringJoiner(":", "{", "}");
        StringJoiner sj2 = new StringJoiner(",", "[", "]");
        sj1.add("Name").add("Tony");
        sj2.add("LastName").add("Strak");
        System.out.println(sj1.merge(sj2).toString());
*/
        StringBuffer sb2 = new StringBuffer("135");
        sb2.replace(0, 5, "6789").insert(0, "12345");

        System.out.println(sb2);
        System.out.println(sb2.reverse().delete(0, 5));


    }
}
