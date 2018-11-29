package com.pogorelov.hometaskMultithreading;

import java.util.ArrayList;

public class ProcessingQueue {
    public static void processingInput () {
        Thread mathematicians = new Thread(new Mathematicians());
        Thread biologists = new Thread(new Biologists());
        ArrayList <String> queue = new ArrayList<>();
        mathematicians.start();
        biologists.start();
        System.out.println(queue);
    }

}
