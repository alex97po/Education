package com.alextrainings.kata4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Print a number: ");
        int targetNumber = sc1.nextInt();
        System.out.print("Print a digit: ");
        int targetDigit = sc1.nextInt();
        System.out.println("We use digit " + targetDigit + " " + CountDigit.countDigit(targetNumber,targetDigit) + " time(s)");
    }
}
