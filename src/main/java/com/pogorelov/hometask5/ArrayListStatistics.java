package com.pogorelov.hometask5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListStatistics {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = IntStream.generate(() -> random.nextInt(10))
                .limit(10)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("array: \n" + Arrays.toString(arrayList.toArray()));

        System.out.println("number of repetitions:\n" + arrayList.stream()
                .collect(Collectors.groupingBy(x -> x,
                        Collectors.counting())).toString());


    }
}