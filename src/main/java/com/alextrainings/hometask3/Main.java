package com.alextrainings.hometask3;
//resolved

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Print numbers with comma: ");
        boolean testResult = Test.test(in.nextLine());
        System.out.println("Asc order: " + testResult);
    }
}
