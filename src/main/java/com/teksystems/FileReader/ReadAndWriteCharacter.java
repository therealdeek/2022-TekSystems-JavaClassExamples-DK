package com.teksystems.FileReader;

import java.io.*;

public class ReadAndWriteCharacter {
    public static void main(String[] args) throws IOException {

        //BufferedReader in = null;
       // BufferedWriter out = null;

        try {
            //change below file path as per your file path
            FileReader reader = new FileReader("/Users/therealdee_k/Desktop/NewDoc.txt");
            BufferedReader br = new BufferedReader(reader);

           // in = new BufferedReader("/Users/therealdee_k/Desktop/NewDoc.txt");
           // out = new BufferedWriter("/Users/therealdee_k/Desktop/JavaIOExample.txt");

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Reading of the file is done!!!");

        } catch (Exception e) {
            System.out.println("IOException:  %s%n");
        }
        /*finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        } */
    }
}
