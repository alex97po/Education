package com.shrekos.lesson2;

public class Main {
    public static Calc calc2;

    public static void main(String[] args) {
        Calc calc = new Calc();
        Calc calc3 = new Calc(80, 100);
        System.out.println(Calc.add(3, 2));
        System.out.println(Calc.odd(6, 5));
        System.out.println(Calc.mult(6, 7));
        System.out.println(Calc.div(32, 4));
        System.out.println(Calc.sqrt(64));
        System.out.println(Calc.sqrt(36));
        calc2 = new Calc();
        System.out.println(calc);
        System.out.println(calc2);
        System.out.println(calc3.accurancy);
    }
}