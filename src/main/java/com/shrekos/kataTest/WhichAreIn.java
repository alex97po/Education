package com.shrekos.kataTest;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        String result = "";
        for (int i = 0; i <= array1.length-1; i++) {
            for (int y = 0; y <= array2.length-1; y++) {
                String temp1 = array1[i];
                String temp2 = array2[y];
                if (temp2.contains(temp1)) {
                    result = result.concat(temp1 + ",");
                }
            }
        }
        return result.split(",");
    }
}
