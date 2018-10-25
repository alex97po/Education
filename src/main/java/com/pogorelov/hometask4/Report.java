package com.pogorelov.hometask4;

public class Report {
    public static void reportForUser () {
        CreateIntArray.inputNecessaryData();
        int [] array = CreateIntArray.createIntArray();
        System.out.println(View.CREATED_ARRAY + array);
        System.out.println(View.AVERAGE_ARRAY_VALUE + ArrayStatistic.averageArrayValue(array));
        System.out.println(View.MIN_INT_VALUE + ArrayStatistic.minimumIntValue(array));
        System.out.println(View.MIN_INT_INDEX + ArrayStatistic.minimumIntIndex(array));
        System.out.println(View.ZERO_ELEMENTS + ArrayStatistic.numberOfZeroElements(array));
        System.out.println(View.ABOVE_ZERO_ELEMENTS + ArrayStatistic.nubberOfElementsAboveZero(array));
        System.out.println(View.MULTIPLIED_ARRAY + ArrayStatistic.arrayMultiplied(array));
    }
}
