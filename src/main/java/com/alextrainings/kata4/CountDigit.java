package com.alextrainings.kata4;

public class CountDigit {
    public static int countDigit (int n, int d) {
        int [] array = new int[n+1];
        for (int i = 0; i <= n; i++) {
            array [i] = (int) Math.pow(i,2);
        }
        String arrayStr = array.toString();
        int arrayTmpStr = arrayStr.length();
        String d1 = Integer.toString(d);
        arrayStr = arrayStr.replaceAll("d1","");
        int countDigit = arrayTmpStr - arrayStr.length();
        return countDigit;
    }
}
