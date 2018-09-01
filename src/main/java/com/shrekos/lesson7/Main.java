package com.shrekos.lesson7;

public class Main {
    public static void main(String[] args) {
       CarInterface car = new Car ();
       SimpleInterface truck = new Truck();
       car.drive();
       truck.stop();
       }
}
