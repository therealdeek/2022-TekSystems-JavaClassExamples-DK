package com.teksystems.FileExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
        /*  ./ means the current file directory
            .// means the parent directory
            the difference between /(forward) and \(back) slashes
            Windows uses \ and Mac/Linux systems use /
            Java figures out slashes pretty good.
            Windows \ character is also the escape character in a string
            windows user must use \\ instead of single slash

         */
       /*  System.out.println("Operating system slash is "+ File.separator);

        File macRoot = new File("/");
        File temp = new File("./newfile.txt");

        for (File fileName : macRoot.listFiles()) {
            System.out.println(fileName + " is a directory " + fileName.isDirectory());
            System.out.println();

        }

        File desktop = new File("/Users/therealdee_k/Desktop/DAVE");
       // System.out.println(desktop + " is on the desktop." + desktop.isDirectory());
        System.out.println(desktop.listFiles());

       */

        try {
//------- change the location of the file-----.
            File file = new File("C:/Users/testingFile.txt");
            Scanner sc = new Scanner(file);
            String data = "";
            while (sc.hasNextLine()) {
                data = sc.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Either file is not found or file is not able to access");
            System.out.println(e.getStackTrace());
            e.printStackTrace();
        }
    }


}

