package com.pogorelov.hometask1;

import java.util.Scanner;

public class Model {
    private static String validation(String expected) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals(expected)) {
            System.out.print(View.WRONG_INPUT);
            input = scanner.nextLine();
        }
        return input;
    }

    public static String add() {
        System.out.print(View.INPUT_HELLO);
        String part1 = validation(View.HELLO);
        System.out.print(View.INPUT_WORLD);
        String part2 = validation(View.WORLD);
        return part1 + View.SPACE + part2;

    }
}
