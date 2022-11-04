package com.data_structures_and_algorithms_CSC301.Labs.Lab10;

import java.util.ArrayList;
import java.util.Scanner;
public class Task4 {
	//number of occurrences of a character in a string
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String word = input.next();
		System.out.print("Please enter a character: ");
		char c = input.next().charAt(0);				 // ??? initialize the character at 0

		int count = count(word, c);
		System.out.printf("%d occurrences of %c in '%s'%n", count, c, word);
	}

	public static int count(String str, char c) {
		if (str.length()== 0)	return 0;//???
		if (str.charAt(0) == c)	return 1 + count(str.substring(1), c);
		return count(str.substring(1), c);
	}
}