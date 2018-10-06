package com.alextrainings.hometask3;
//resolved

public class Test {
    public static boolean test (String input) {
        String numbersLineArr [] = input.split (",");
        int inputNumbers [] = new int[numbersLineArr.length];
        for (int y = 0; y < inputNumbers.length; y++) {
            inputNumbers [y] = Integer.parseInt(numbersLineArr[y]);
        }
        boolean order = true;
        if (inputNumbers.length != 1) {
            for (int i = 0; i < inputNumbers.length - 1; i++) {
                if (inputNumbers[i] > inputNumbers[i + 1]) {
                    order = false;
                    break;
                }
            }
        }
            return  order;
    }
}
