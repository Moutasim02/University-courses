package com.programming_II_CSC202.Lectures.ChapterTen;

//The String Class is immutable
public class RegexPractice {
    public static void main(String[] args) {
        // From section 4
        String a = "Fun#Fun#";
        String b = "Fun#un#";
        String c = "   Fun#Fun#";
        System.out.println(a.charAt(0));
        System.out.println(a.length());
        System.out.println(a.substring(1));
        System.out.println(a.substring(1, 7));
        System.out.println(a.indexOf('u'));
        System.out.println(a.lastIndexOf('u'));
        System.out.println(a.equals(b));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(c.trim());

        System.out.println("-----------------------");


        String s1 = "Welcome to java";
        String s2 = new String("Programming is fun");
        String s3 = "Java Java Java";

        System.out.println(s1.replace('a', '!'));
        System.out.println(s3.replaceAll("Java", "Ahmad"));
        System.out.println(s3.replaceFirst("Java", "Ahmad"));

        String[] words = "\nWelcome#to#java".split("#");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println("\n");

        // (.) means any character, (*) means any number of character
        //matches used to compare a string with a pattern
        System.out.println("Java is fun".matches("Java.*")); // true
        System.out.println("Java is cool".matches(".is.")); // false
        System.out.println("Java is powerful".matches(".*powerful")); // true

        // \d represent a single digit and \d{3} represent 3 digits
        System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}")); // true

        //regular expression [+$#] specifies a pattern
        System.out.println("a+b$#c".replaceAll("[+$#]", "A")); // aAbAAc

        //regular expression [.,:;?] specifies a pattern
        String[] token = "Java,C?,C#,C++".split("[.,:;?]");
        for (int i = 0; i < token.length; i++) {
            System.out.print(token[i] + " ");
        } // Java C  C# C++
        System.out.println("");


        char[] chars = s2.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        } // P r o g r a m m i n g   i s   f u n
        System.out.println("");

        String s4 = "Welcome to Java";
        String s5 = s4;
        String s6 = new String("Welcome to Java");
        String s7 = "Welcome to Java";

        System.out.println(s4 == s5);
        System.out.println(s4 == s6);
        System.out.println(s4 == s7);
        System.out.println(s4.equals(s6));
        System.out.println(s4.equals(s7));
    }
}

