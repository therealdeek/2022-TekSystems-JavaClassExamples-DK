package com.teksystems.NewInputOutputJava;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class JavaASCIIExample {

    public static void main(String[] args)
            throws IOException {
        try {
            FileReader reader = new FileReader("/Users/therealdee_k/Desktop/JavaIOExample.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.print(Arrays.toString(line.getBytes(StandardCharsets.UTF_8)));
            }
            System.out.println("Reading of the file is done!!!");

        } catch (Exception e) {
            System.out.println("IOException:  %s%n");
        }

    /*
        // Creating an object of Path class and
        // assigning local directory path of file to it
        Path path = Paths.get(
                "/Users/therealdee_k/Desktop/JavaIOExample.txt");

        // Converting the file into a byte array
        // using Files.readAllBytes() method
        byte[] arr = Files.readAllBytes(path);

        // Printing the above byte array
        System.out.println("My file in ASCII is below");
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

} */

    }
}


