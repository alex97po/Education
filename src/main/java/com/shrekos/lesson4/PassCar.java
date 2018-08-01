package com.shrekos.lesson4;

class PassCar extends Car {
    private String type;
    public PassCar(int price, double fuel, String type) {
        super(price, fuel);
        this.type = type;
    }
}