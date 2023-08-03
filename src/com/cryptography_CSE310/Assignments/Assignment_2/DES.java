package com.cryptography_CSE310.Assignments.Assignment_2;

public class DES {

    //! Applying flow steps in this file
    public static String encrypt(String plaintext, String key) {
        String cipheredText = "";

        // 1st (PC-1 & PC-2)
        KeyGenerator.generatePC1();
        String k1 = KeyGenerator.generatePC2();

        // 2nd (IP)
        BitPermutation.initialPermutation();

        // 3rd (R0 -> E(R0))
        String expanded = DataExpansion.expand32To48();

        // 4th (Apply A = E[R0] xor K1)
        DESUtils.xor(expanded, k1);

        // 5th & 6th (Group 6 bits per block, apply s-box)
        Sbox sbox = new Sbox();
        sbox.evaluateSbox(cipheredText);
        DESUtils.regroup();
        sbox.applySbox(cipheredText);

        // 7th (Apply permutation to get P(B))
        BitPermutation.secondPermutation();

        // 8th (Calculate R1 = P(B) xor L0)

        return cipheredText;
    }
}
