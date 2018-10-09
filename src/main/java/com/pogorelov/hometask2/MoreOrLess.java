package com.pogorelov.hometask2;

import java.util.Scanner;

public class MoreOrLess {
    public static int moreless() {
        int input = inputNumber();
        int target = (int) (Math.random() * 101);
        int rangeMin = 0;
        int rangeMax = 100;
        while (!validation(input, rangeMin, rangeMax)) {
            validation(input,rangeMin, rangeMax);
        }
        boolean flag2 = true;
        while (flag2) {
            if (input == target) {
                flag2 = false;
            } else if (input < target) {
                rangeMin = input;
                System.out.println(View.LESS_THAN_NEEDED);
                System.out.println(input + View.RANGE + rangeMax);
                input = inputNumber();
            } else {
                rangeMax = input;
                System.out.println(View.MORE_THAN_NEEDED);
                System.out.println(rangeMin + View.RANGE + input);
                input = inputNumber();
            }

        }
        return target;
    }

    private static boolean validation (int input, int rangeMin, int rangeMax) {
       boolean flag = true;
       if (input > rangeMax || input < rangeMin) {
           System.out.println(View.WRONG_INPUT);
           System.out.println(View.GUESS_NUMBER);
           flag = false;
       }
       return flag;
    }

    public static int inputNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.print(View.GUESS_NUMBER);
        int input = scanner.nextInt();
        return input;
    }
}