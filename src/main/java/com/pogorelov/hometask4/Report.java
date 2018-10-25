package com.pogorelov.hometask4;

public class Report {
    public static void reportForUser () {
        CreateIntArray.inputNecessaryData();
        System.out.println(View.CREATED_ARRAY + CreateIntArray.createIntArray());
        System.out.println(View.AVERAGE_ARRAY_VALUE + ArrayStatistic.averageArrayValue(CreateIntArray.createIntArray()));
        System.out.println(View.MIN_INT_VALUE + ArrayStatistic.minimumIntValue(CreateIntArray.createIntArray()));
        System.out.println(View.MIN_INT_INDEX + ArrayStatistic.minimumIntIndex(CreateIntArray.createIntArray()));
        System.out.println(View.ZERO_ELEMENTS + ArrayStatistic.numberOfZeroElements(CreateIntArray.createIntArray()));
        System.out.println(View.ABOVE_ZERO_ELEMENTS + ArrayStatistic.nubberOfElementsAboveZero(CreateIntArray.createIntArray()));
        System.out.println(View.MULTIPLIED_ARRAY + ArrayStatistic.arrayMultiplied(CreateIntArray.createIntArray()));
    }
}
