package com.teksystems.NewInputOutputJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class NioExampleTwo {
    public static void main(String[] args) throws IOException {

        String[] inputFiles = {"/Users/therealdee_k/Downloads/file1.txt",
                "/Users/therealdee_k/Downloads/file2.txt"};
        String outputFile = "/Users/therealdee_k/Desktop/OutputExampleTwoPractice.txt";

        FileOutputStream fos = new FileOutputStream(outputFile);
        WritableByteChannel targetChannel = fos.getChannel();

        for (int i = 0; i < inputFiles.length; i++) {
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();

            inputChannel.transferTo(0, inputChannel.size(), targetChannel);
            inputChannel.close();
            fis.close();
        }

        targetChannel.close();
        fos.close();

    }
}
