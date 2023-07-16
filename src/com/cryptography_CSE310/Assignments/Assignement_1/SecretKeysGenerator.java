package com.cryptography_CSE310.Assignments.Assignement_1;

import java.util.ArrayList;

public class SecretKeysGenerator {

    public static ArrayList<String> generatePossibleKeys(String key) {
        ArrayList<String> possibleKeys = new ArrayList<>();
        int keyLength = key.length();
        for (int i = 0; i < keyLength; i++) {
            for (int j = 0; j < keyLength; j++) {
                for (int k = 0; k < keyLength; k++) {
                    for (int l = 0; l < keyLength; l++) {
                        for (int m = 0; m < keyLength; m++) {
                            for (int n = 0; n < keyLength; n++) {
                                String secretKey = "" + key.charAt(i) + key.charAt(j)
                                        + key.charAt(k) + key.charAt(l) + key.charAt(m)
                                        + key.charAt(n);
                                if (!possibleKeys.contains(secretKey)) {
                                    possibleKeys.add(secretKey);
                                }
                            }
                        }
                    }
                }
            }
        }
        return possibleKeys;
    }

}
