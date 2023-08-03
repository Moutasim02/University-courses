package com.cryptography_CSE310.Assignments.Assignment_2;

public class DES {
    static String plaintext = "100010010101";
    static String[] keys = {"11010011", "00111100", "11110011", "10100011", "10111111"};
    static int round;

    public static String encrypt() {
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1 -> setPlaintext(encryptHelper(plaintext, keys[0]));
                case 2 -> setPlaintext(encryptHelper(plaintext, keys[1]));
                case 3 -> setPlaintext(encryptHelper(plaintext, keys[2]));
                case 4 -> setPlaintext(encryptHelper(plaintext, keys[3]));
                case 5 -> setPlaintext(encryptHelper(plaintext, keys[4]));
            }
        }
        return getPlaintext();
    }

    private static String encryptHelper(String text, String key) {
        BitPermutation bitPermutation = new BitPermutation();

        // 1st (IP with R and L)
        String initialPermutation = bitPermutation.initialPermutation(text);
        String leftSide = initialPermutation.substring(0, 6);
        String rightSide = initialPermutation.substring(6);

        // 2nd (R0 -> E(R0))
        DataExpansion dataExpansion = new DataExpansion();
        String expanded = dataExpansion.expand(rightSide);

        // 3rd (Apply A = E[R0] xor K1)
        String firstXOR = DESUtils.xor(expanded, key, 8);

        // 4th & 5th (Group 3 bits per block, apply s-box)
        String[] split = DESUtils.split(firstXOR);
        SBox sbox = new SBox();
        String str = sbox.applySBox(split);

        // 6th (Apply permutation to get P(B))
        String secondPerm = bitPermutation.secondPermutation(str);

        // 7th (Calculate R1 = P(B) xor L0)
        String secondXOR = DESUtils.xor(secondPerm, leftSide, 6);
        String reversed = DESUtils.reverse(rightSide, secondXOR);

        // 8th (Getting plain text with IP-Inverse)
        String s = bitPermutation.finalPermutation(reversed);

        System.out.printf("""
                                        
                        Round #%d:
                        Initial Permutation: %s
                        Left Side: %s
                        Right Side: %s
                        Expanded: %s
                        First XOR: %s
                        After SBox: %s
                        Second Permutation: %s
                        Second XOR: %s
                        Reversed(RL): %s
                                        
                        """, round, initialPermutation, leftSide, rightSide,
                expanded, firstXOR, str, secondPerm, secondXOR, reversed);
        round++;
        return s;
    }

    public static void setPlaintext(String plaintext) {
        DES.plaintext = plaintext;
    }

    public static String getPlaintext() {
        return plaintext;
    }
}
