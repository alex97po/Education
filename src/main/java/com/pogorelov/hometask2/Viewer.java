package com.pogorelov.hometask2;

import java.util.Scanner;

public class Viewer {
    public static int viewer () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Try to guess a number: ");
        int input = scanner.nextInt();
        return input;
    }
}
