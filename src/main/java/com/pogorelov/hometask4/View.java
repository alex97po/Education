package com.pogorelov.hometask4;

public class View {
    private static final String INPUT_ARRAY_LENGTH = "Print a number to define future array length: ";
    private static final String INDEX_OF_MULTIPLYING = "Print a number for array to multiply: ";
    public static final String CREATED_ARRAY = "In this session we have used next array: ";
    public static final String AVERAGE_ARRAY_VALUE = "Average array value is ";
    public static final String MIN_INT_VALUE = "Minimum value in the array is ";
    public static final String MIN_INT_INDEX = "Index of this element in the array is ";
    public static final String ZERO_ELEMENTS = "Amount of 0 in the array is ";
    public static final String ABOVE_ZERO_ELEMENTS = "Amount of elements above 0 in the array is ";
    public static final String MULTIPLIED_ARRAY = "After mulpiplying the array with the index defined above, new array is: ";


    public static void inputArrayLength () {
        System.out.print(INPUT_ARRAY_LENGTH);
    }

    public static void inputMultiplyingIndex () {
        System.out.print(INDEX_OF_MULTIPLYING);
    }
}
