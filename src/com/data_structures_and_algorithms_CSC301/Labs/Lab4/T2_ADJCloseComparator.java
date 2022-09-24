package com.data_structures_and_algorithms_CSC301.Labs.Lab4;

import java.util.*;

class ADJCloseComparator implements Comparator<T1_Stock> {
    // Compares two stocks using their adjusted closing price ADJClose
    public int compare(T1_Stock s1, T1_Stock s2) {
        if (s1.compareTo(s2) == 0) {
            if (s1.ADJClose15 == s2.ADJClose15) {
                return 0;
            } else if (s1.ADJClose15 > s2.ADJClose15) {
                return 1;
            } else {
                return -1;
            }
        } else return s1.compareTo(s2);
    }

}
