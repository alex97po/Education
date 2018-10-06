package com.alextrainings.kata3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print an array of binary: ");
        String inputString = sc.nextLine();
        System.out.println(Decimal.toDecimal(BinaryArray.binaryArray(inputString)));
    }
}
