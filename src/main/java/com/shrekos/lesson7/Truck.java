package com.shrekos.lesson7;

public class Truck implements CarInterface, SimpleInterface {

    @Override
    public void drive() {
        System.out.println("Truck Drive");
    }

    @Override
    public void stop() {
        System.out.println("Truck Stop");
    }
}
