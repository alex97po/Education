package com.alextrainings.lesson4;

public class Car {
   private int price;
   private double fuel;

    public Car (int price, double fuel) {
        this.price = price;
        this.fuel = fuel;
    }

    public int getPrice() {
        return price;
    }

    public double getFuel() {
        return fuel;
    }
}