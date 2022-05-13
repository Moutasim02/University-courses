package com.programming_II_CSC202.Lectures.ChapterTwelve;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
            if (file.exists()) {
                System.out.println("File exists");
                System.exit(0);
            }
        try (PrintWriter writer = new PrintWriter(file)) {
            {
                // Write to the file
                writer.print("Hello World \n");
                writer.print(90);

                // Close the file
                writer.close();
            }
        }
    }
}
