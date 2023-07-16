package com.cryptography_CSE310.Assignments.Assignement_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SecretKeyGeneratorTest {
    public static void main(String[] args) {
        String key = "MOLSKF";
        ArrayList<String> arr = SecretKeysGenerator.generatePossibleKeys(key);
        arr.forEach(System.out::println);

        try {
            FileWriter writer = new FileWriter("./output.txt");
            for (String s : arr) {
                writer.write(s + "\n");
            }
            writer.close();
            System.out.println("Output written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
