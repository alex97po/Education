package com.pogorelov.hometask1;

import java.util.Scanner;

public class Model {
   private static String validation (String expected) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals(expected)) {
            System.out.print(Viewer.WRONG_INPUT);
            input = scanner.nextLine();
        }
        return input;
    }

    public static String add () {
        System.out.print(Viewer.INPUT_HELLO);
        String part1 = validation(Viewer.HELLO);
        System.out.print(Viewer.INPUT_WORLD);
        String part2 = validation(Viewer.WORLD);
        return part1 + Viewer.SPACE + part2;

    }
}
