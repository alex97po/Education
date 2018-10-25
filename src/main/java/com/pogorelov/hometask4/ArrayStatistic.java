package com.pogorelov.hometask4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayStatistic {
    public static double averageArrayValue(int[] array) {
        return IntStream.of(array).average().getAsDouble();
    }

    public static int minimumIntValue(int[] array) {
        return IntStream.of(array).min().getAsInt();
    }

    public static int minimumIntIndex(int[] array) {
        return IntStream.of(array).boxed().collect(Collectors.toList()).indexOf(minimumIntValue(array));
    }

    public static int numberOfZeroElements(int[] array) {
        return (int) IntStream.of(array).filter(arr -> arr == 0).count();
    }

    public static int numberOfElementsAboveZero(int[] array) {
        return (int) IntStream.of(array).filter(arr -> arr > 0).count();
    }

    public static int[] arrayMultiplied(int[] array) {
        return IntStream.of(array).map(arr -> arr * CreateIntArray.index).toArray();
    }

}
