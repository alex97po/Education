package com.alextrainings.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[10];
        int j = 0;
        for (int i = 0; i < arr.length * 2; i++) {
            if (i % 2 == 0) {
                arr[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}