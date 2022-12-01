package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestBST {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("input.txt"));
            while (scanner.hasNext()) {
                String temp = scanner.next().replaceAll("[\"()]", "").toLowerCase();

                if (!(temp.replaceAll("[,:]", "").equals("the") ||
                        temp.replaceAll("[,:]", "").equals("a") ||
                        temp.replaceAll("[,:]", "").equals("an"))) {
                    words.add(0, temp);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String[] strings = words.toArray(new String[0]);
        BST<String> binarySearchTree = new BST<>(strings);
        binarySearchTree.print();

    }
}
