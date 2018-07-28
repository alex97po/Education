package com.shrekos.lesson1;

public class FirstProgram {
    public static byte b = (byte) 129;
    public static long i = 10000000000000000L;
    public static long l = 10000;
    public static float f = 1.11f;
    public static double d = 1.1111;
    public static char c = '*';
    public static boolean a = true;
    public static int chinaPopulation = 1360000000;
    public static int indiaPopulation = 1240000000;
    public static int total = chinaPopulation + indiaPopulation;
    public static byte b1 = 1;
    public static byte b2 = 2;
    public static byte b3 = (byte) (b1 + b2);
    public static int i1 = 123456789;
    public static float f1 = i1;
    public static double d1 = i1;
    public static short s1 = (short) i1;
    public static double x = 1.0;
    public static double y = 0.0;
    public static double z = x / y;
    public static double x1 = 1;
    public static double y1 = 0;
    public static double z1 = x / y;

    public static void main(String[] args) {
        System.out.println("Hello, Князь!");
        b += 1;
        System.out.println(b);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(a);

        System.out.println(total);
        System.out.println("int: " + i1);
        System.out.println("float: " + f1);
        System.out.println("double: " + d1);
        System.out.println("short: " + s1);
        System.out.println(z);
        System.out.println(z1);
        System.out.println("z1 + 1 = " + (z1 + 1));
        System.out.println("+0.0 == -0.0 : " + (0.0 == -0.0));
        System.out.println("x1/(+0.0) = " + (x1 / (+0.0)));
        System.out.println("x1/(-0.0) = " + (x1 / (-0.0)));
        System.out.println("z1 = " + z1);
        System.out.println("z1 + 0 = " + (z1 + 0));
        System.out.println("z1 < 0 = " + (z1 < 0));
        System.out.println("z1 > 0 = " + (z1 > 0));
        System.out.println("z1 == = " + (z1 == 0));
        System.out.println("z1 != = " + (z1 != 0));
        System.out.println("z1 == = " + (z1 == z1));
        System.out.println("z1 != = " + (z1 != z1));
        System.out.println("z1 == NaN: " + (z1 == Double.NaN));
        System.out.println("z1 is NaN: " + Double.isNaN(c));
    }
}
