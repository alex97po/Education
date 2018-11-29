package com.pogorelov.hometaskMultithreading;

import java.util.ArrayList;

public class Biologists implements Runnable {
    public static int numberOfBio = 20;

    public synchronized void add(ArrayList queue) {
        int inputNumber = (int) Math.random() * 20 + 1;
        if (inputNumber < numberOfBio) {
            for (int i = 1; i <= inputNumber; i++) {
                queue.add("Bio");
                numberOfBio = numberOfBio - inputNumber;
            }
        }
//        if (numberOfBio > 0) {
//            add(queue);
//        }
    }

    @Override
    public void run() {
        add (ProcessingQueue.queue);
    }
}
