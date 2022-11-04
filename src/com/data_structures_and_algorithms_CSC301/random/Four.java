package com.data_structures_and_algorithms_CSC301.random;

public class Four {
    public static void main(String[] args) {
        System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
        System.out.println("Is a a palindrome? " + isPalindrome("a"));
        System.out.println("Is aba a palindrome? " + isPalindrome("aba"));

        String space = "race car";
        space = space.replace(" ", "");


    }


    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);

    }


    private static boolean isPalindrome(String s, int low, int high) {
        if (high <= low)
            return true;
        else if (s.charAt(low) != s.charAt(high))
            return false;
        else return isPalindrome(s, low + 1, high - 1);

    }

}
