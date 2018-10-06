package com.alextrainings.lesson7;

public class Car implements CarInterface {
    public void drive() {
        System.out.println("Car Drive");
    }

    @Override
    public void stop() {
        System.out.println("Car Stop");
    }
}
