package com.shrekos.kata2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print a number: ");
        int inputNumber = sc.nextInt();
        Negative.negativeNumber(inputNumber);
    }
}
