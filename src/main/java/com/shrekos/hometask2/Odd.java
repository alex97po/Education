package com.shrekos.hometask2;

import java.util.Arrays;

public class Odd {
    public static int [] odd (int target) {
    if (target % 2 == 0) {
        target = target - 1;
    }
    int [] odds = new int[(target / 2) + 1];
    for (int i=0; target >= 1; i++) {
        odds [i] = target;
        target = target - 2;
    }
        Arrays.sort(odds);
    return odds;
    }
}
