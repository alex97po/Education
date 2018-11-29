package com.pogorelov.hometaskMultithreading;


import java.util.ArrayList;

public class Mathematicians implements Runnable {
    public static int numberOfMath = 25;

    public void add (ArrayList queue) {
        int inputNumber = (int) Math.random() * 50 + 1;
        if (inputNumber < numberOfMath) {
            for (int i = 1; i <= inputNumber; i++) {
                queue.add("Math");
                numberOfMath = numberOfMath - inputNumber;
            }
        }
        if (numberOfMath > 0) {
           add (queue);
        }
    }

    @Override
    public void run() {
        add(new ArrayList());
    }
}
