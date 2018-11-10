package com.pogorelov.hometask5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class ArrayListStatistics {
    public static void arrayListStatistics () {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(arraySize);
        for (int i = 0; i<arraySize; i++) {
            arrayList.add((int)(Math.random()*100-30));
        }
    }
}
