package com.alextrainings.hometask2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Print a number: ");
        int input_number = in.nextInt();
        int[] test = Odd.odd(input_number);
        System.out.println("Odd numbers: " + Arrays.toString(test));
    }

}
