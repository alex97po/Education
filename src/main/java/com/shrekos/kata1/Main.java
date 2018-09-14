package com.shrekos.kata1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print a string to be repeated: ");
        String inputString = sc.nextLine();
        System.out.print("Print a number of times previous string to be repeated: ");
        int inputNumber = sc.nextInt();
        RepeatString.repeatStr(inputNumber,inputString);
    }
}
