package com.shrekos.lesson2;

public class Calc {
    public int chargeLevel;
    public int accurancy;

    public Calc() {
    }

    public Calc(int chargeLevel, int accurancy) {
        this.chargeLevel = chargeLevel;
        this.accurancy = accurancy;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int odd(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }
}
