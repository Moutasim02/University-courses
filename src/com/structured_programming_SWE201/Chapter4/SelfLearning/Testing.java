package com.structured_programming_SWE201.Chapter4.SelfLearning;

public class Testing {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i<10; i++) {
            sum += i;
            if ( sum % 3== 0 )
                continue;
            System.out.println( i +"\t" +sum );
        }
    }
}
