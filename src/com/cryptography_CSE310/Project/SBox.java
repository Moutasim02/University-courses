package com.cryptography_CSE310.Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SBox {
    int[][] firstSBox = generateSBOX();
    int[][] inverseFirstSBox = generateInverseSBox(firstSBox);

    int[][] secondSBox = generateSBOX();
    int[][] inverseSecondSBox = generateInverseSBox(secondSBox);

    int[][] thirdSBox = generateSBOX();
    int[][] inverseThirdSBox = generateInverseSBox(thirdSBox);

    int[][] fourthSBox = generateSBOX();
    int[][] inverseFourthSBox = generateInverseSBox(fourthSBox);

    int[][] fifthSBox = generateSBOX();
    int[][] inverseFifthSBox = generateInverseSBox(fifthSBox);

    int[][] sixthSBox = generateSBOX();
    int[][] inverseSixthSBox = generateInverseSBox(sixthSBox);

    int[][] seventhSBox = generateSBOX();
    int[][] inverseSeventhSBox = generateInverseSBox(seventhSBox);

    int[][] eighthSBox = generateSBOX();
    int[][] inverseEighthSBox = generateInverseSBox(eighthSBox);

    int[][] ninthSBox = generateSBOX();
    int[][] inverseNinthSBox = generateInverseSBox(ninthSBox);

    int[][] tenthSBox = generateSBOX();
    int[][] inverseTenthSBox = generateInverseSBox(tenthSBox);

    public String printInverseSBoxes() {
        return Constants.ANSI_BLUE + "I-SBox" + Constants.ANSI_RESET + " {" +
                "\ninverseFirstSBox=" + Arrays.deepToString(inverseFirstSBox) +
                " \ninverseSecondSBox=" + Arrays.deepToString(inverseSecondSBox) +
                " \ninverseThirdSBox=" + Arrays.deepToString(inverseThirdSBox) +
                " \ninverseFourthSBox=" + Arrays.deepToString(inverseFourthSBox) +
                " \ninverseFifthSBox=" + Arrays.deepToString(inverseFifthSBox) +
                " \ninverseSixthSBox=" + Arrays.deepToString(inverseSixthSBox) +
                " \ninverseSeventhSBox=" + Arrays.deepToString(inverseSeventhSBox) +
                " \ninverseEighthSBox=" + Arrays.deepToString(inverseEighthSBox) +
                " \ninverseNinthSBox=" + Arrays.deepToString(inverseNinthSBox) +
                " \ninverseTenthSBox=" + Arrays.deepToString(inverseTenthSBox) +
                "\n}";
    }

    @Override
    public String toString() {
        return Constants.ANSI_BLUE + "SBox" + Constants.ANSI_RESET + " {" +
                "\nfirstSBox=" + Arrays.deepToString(firstSBox) +
                " \nsecondSBox=" + Arrays.deepToString(secondSBox) +
                " \nthirdSBox=" + Arrays.deepToString(thirdSBox) +
                " \nfourthSBox=" + Arrays.deepToString(fourthSBox) +
                " \nfifthSBox=" + Arrays.deepToString(fifthSBox) +
                " \nsixthSBox=" + Arrays.deepToString(sixthSBox) +
                " \nseventhSBox=" + Arrays.deepToString(seventhSBox) +
                " \neighthSBox=" + Arrays.deepToString(eighthSBox) +
                " \nninthSBox=" + Arrays.deepToString(ninthSBox) +
                " \ntenthSBox=" + Arrays.deepToString(tenthSBox) +
                "\n}";
    }

    public String applySBox(String block, int sBoxNumber) {
        int[][] selectedSBox = switch (sBoxNumber) {
            case 1 -> firstSBox;
            case 2 -> secondSBox;
            case 3 -> thirdSBox;
            case 4 -> fourthSBox;
            case 5 -> fifthSBox;
            case 6 -> sixthSBox;
            case 7 -> seventhSBox;
            case 8 -> eighthSBox;
            case 9 -> ninthSBox;
            case 10 -> tenthSBox;
            default -> throw new IllegalStateException("Unexpected value: " + sBoxNumber);
        };

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < block.length(); i += 4) {
            String subBlock = block.substring(i, i + 4);
            int col = Integer.parseInt(subBlock.substring(0, 2), 2);
            int row = Integer.parseInt(subBlock.substring(2), 2);
            int value = selectedSBox[row][col];
            result.append(String.format("%4s", Integer.toBinaryString(value)).replace(' ', '0'));
        }
        return result.toString();
    }

    public String applyInverseSBox(String block, int sBoxNumber) {
        int[][] selectedSBox = switch (sBoxNumber) {
            case 1 -> inverseFirstSBox;
            case 2 -> inverseSecondSBox;
            case 3 -> inverseThirdSBox;
            case 4 -> inverseFourthSBox;
            case 5 -> inverseFifthSBox;
            case 6 -> inverseSixthSBox;
            case 7 -> inverseSeventhSBox;
            case 8 -> inverseEighthSBox;
            case 9 -> inverseNinthSBox;
            case 10 -> inverseTenthSBox;
            default -> throw new IllegalArgumentException("Invalid sBoxNumber: " + sBoxNumber);
        };

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < block.length(); i += 4) {
            String subBlock = block.substring(i, i + 4);
            int col = Integer.parseInt(subBlock.substring(0, 2), 2);
            int row = Integer.parseInt(subBlock.substring(2), 2);
            int value = selectedSBox[row][col];
            result.append(String.format("%4s", Integer.toBinaryString(value)).replace(' ', '0'));
        }
        return result.toString();
    }

    public int[][] generateSBOX() {
        int[][] sBox = new int[4][4];
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 16; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sBox[i][j] = numbers.get(index);
                index++;
            }
        }
        return sBox;
    }

    public int[][] generateInverseSBox(int[][] sBox) {
        int[][] inverseSBox = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sBoxValue = sBox[i][j];
                StringBuilder newLocation = new StringBuilder(String.format
                        ("%4s", Integer.toBinaryString(sBoxValue)).replace(' ', '0'));                String i1 = String.format("%2s", Integer.toBinaryString(i)).replace(' ', '0');
                String j1 = String.format("%2s", Integer.toBinaryString(j)).replace(' ', '0');
                String ijLocation = i1.concat(j1);
                int newValue = Integer.parseInt(ijLocation, 2);

                int newI = Integer.parseInt(newLocation.substring(0, 2), 2);
                int newJ = Integer.parseInt(newLocation.substring(2, 4), 2);

                inverseSBox[newI][newJ] = newValue;
            }
        }
        return inverseSBox;
    }

}
