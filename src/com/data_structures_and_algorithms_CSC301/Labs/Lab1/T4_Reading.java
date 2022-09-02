package com.data_structures_and_algorithms_CSC301.Labs.Lab1;

/**
 * Moutasim El Ayoubi - 1080415
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T4_Reading {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("ToRead.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            int code = scanner.nextInt();
            String violation = scanner.next();
            int fine = scanner.nextInt();
            String paid = scanner.next();
            System.out.print(code + " " + violation + " " + fine + " " + paid + "\n");
        }
    }
}
