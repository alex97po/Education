package com.shrekos.kata4;

public class CountDigit {
    public static int countDigit (int n, int d) {
        int [] array = new int[n+1];
        for (int i = 0; i <= n; i++) {
            array [i] = (int) Math.pow(i,2);
        }
        int digitCount = 0;
        for (int y = 0; y <= n; y++) {
            if (array.toString().contains(Integer.toString(d))) {
                digitCount++;
            }
        }
        return digitCount;
    }
}
