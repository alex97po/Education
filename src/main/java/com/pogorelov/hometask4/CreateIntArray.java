package com.pogorelov.hometask4;

import java.util.Scanner;

public class CreateIntArray {
    static int arrayLength;
    static int index;

    public static void inputNecessaryData() {
        Scanner scanner = new Scanner(System.in);
        View.inputArrayLength();
        while (!scanner.hasNextInt()) {
            System.out.println(View.WRONG_INPUT);
            View.inputArrayLength();
            scanner.nextLine();
        }
        arrayLength = scanner.nextInt();

        View.inputMultiplyingIndex();
        while (!scanner.hasNextInt()) {
            System.out.println(View.WRONG_INPUT);
            View.inputMultiplyingIndex();
            scanner.nextLine();
        }
        index = scanner.nextInt();
    }


    public static int[] createIntArray() {
        int[] array = new int[arrayLength];
        for (int arrayIndex : array) {
            array[arrayIndex] = (int) (Math.random() * 100-30);
        }
        return array;
    }

}
