package com.data_structures_and_algorithms_CSC301.random;

import java.util.ArrayList;
import java.util.Stack;

import static java.lang.String.valueOf;

public class Test {
    public static void main(String[] args) {

        String taskName = "100+20+50*10";

        System.out.println(taskName);
        int result = 0;
        String str = "";
        char[] chars = taskName.toCharArray();
        ArrayList<Character> characterArrayList = new ArrayList<>();
        for (char aChar : chars) {
            characterArrayList.add(aChar);
        }
        characterArrayList.add((char) 32);
        Stack<String> toStoreInteger = new Stack<>();
        Stack<String> toStoreOperands = new Stack<>();
        char num = 32;

        // Add the character to the suitable stack
        for (int i = 0; i < characterArrayList.size(); i++) {
            if (Character.isDigit(characterArrayList.get(i))) {
                str = str.concat(valueOf(characterArrayList.get(i)));
            } else {
                toStoreInteger.push(str);
                if (!valueOf(characterArrayList.get(i)).equals(valueOf(num))) {
                    toStoreOperands.push(valueOf(characterArrayList.get(i)));
                }
                str = "";
            }
        }
        System.out.println(toStoreOperands);
        System.out.println(toStoreInteger);

        // [+, +, *]
        // [100, 20, 50, 10]
        // Find result
        for (int i = 0; i < toStoreInteger.size(); i++) {
            for (int j = 0; j < toStoreOperands.size(); j++) {
                int firstNumber = Integer.parseInt(toStoreInteger.pop());
                String operand = toStoreOperands.pop();
                int secondNumber = Integer.parseInt(toStoreInteger.pop());
                char c = operand.charAt(0);

                if (c == 45) { // -
                    result = result - (firstNumber - secondNumber);
                } else if (c == 47) { // /
                    result = result + firstNumber / secondNumber;
                } else if (c == 43) { // +
                    result = result + firstNumber + secondNumber;
                } else if (c == 42 && result != 0) { // *
                    result = result * firstNumber * secondNumber;
                } else {
                    result = firstNumber * secondNumber;
                }

            }
        }
        System.out.println(result);
    }
}
 