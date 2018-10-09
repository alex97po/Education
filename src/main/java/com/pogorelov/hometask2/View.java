package com.pogorelov.hometask2;

public class View {
    public  static final String GUESS_NUMBER = "Try to guess a number: ";
    public static final String CORRECT_ANSWER = "Congratulations! You are right, the number we were thinking of was ";
    public static final String MORE_THAN_NEEDED = "Correct number is less than your guess!";
    public static final String LESS_THAN_NEEDED = "Correct number is more than your guess! ";
    public static final String RANGE = "...x...";
    public static final String WRONG_INPUT = "Bad shot! Yoy have already narrowed your search range!";

    public static void output (int result) {
        System.out.println(CORRECT_ANSWER + result);
    }
}
