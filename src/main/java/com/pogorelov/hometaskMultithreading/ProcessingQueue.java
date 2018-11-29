package com.pogorelov.hometaskMultithreading;

import java.util.ArrayList;

public class ProcessingQueue {
    static ArrayList <String> queue = new ArrayList<>();
    public static void processingInput () {
        Thread mathematicians = new Thread(new Mathematicians());
        Thread biologists = new Thread(new Biologists());
        mathematicians.start();
        biologists.start();
        System.out.println(queue);
    }
}
