package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class TestBST {
    public static void main(String[] args) {
        BST<String> binarySearchTree = new BST<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
            LineNumberReader lineNumberReader = new LineNumberReader(bufferedReader);

            while (lineNumberReader.ready()) {
                int lineNum = lineNumberReader.getLineNumber() + 1;
                String temp = lineNumberReader.readLine().replaceAll("[\"()?,.!;:-]", "").toLowerCase();
                Scanner sc = new Scanner(temp);
                while (sc.hasNext()) {
                    String next = sc.next();
                    if (!(next.equals("the") ||
                            next.equals("a") ||
                            next.equals("an"))) {
                        binarySearchTree.insert(next, lineNum);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Wrong File Name!");
        }

        System.out.println(binarySearchTree.getWordOccurrence("five"));
        System.out.println(binarySearchTree.getLineOfOccurrence("five"));

        binarySearchTree.print();

    }
}
