package com.pogorelov.hometask2;

public class MoreOrLess {
    public static void moreless(int input) {
        int target = (int) (Math.random() * 101);
        int rangeMin = 0;
        int rangeMax = 100;
        boolean flag = true;
        while (flag) {
            if (input == target) {
                flag = false;
                System.out.println("Congratulations! You are right, the number we were thinking of was " + target);
            } else if (input < target) {
                rangeMin = input;
                System.out.println("More");
                System.out.println("[" + input + "...x..." + rangeMax + "]");
                input = Viewer.viewer();
            } else {
                rangeMax = input;
                System.out.println("Less");
                System.out.println("[" + rangeMin + "...x..." + input + "]");
                input = Viewer.viewer();
            }

        }
    }
}
