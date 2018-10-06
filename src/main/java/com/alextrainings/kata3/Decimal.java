package com.alextrainings.kata3;

public class Decimal {
     public static int toDecimal (byte [] arrayBinary) {
         int result = 0;
         int power = 0;
        for (int i = arrayBinary.length-1; i >= 0; i--, power++) {
            result = result + arrayBinary[i] * (int) Math.pow(2,power);
        }
        return result;
    }
}
