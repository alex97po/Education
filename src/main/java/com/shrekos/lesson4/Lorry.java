package com.shrekos.lesson4;

class Lorry extends Car {
    private int carrying;
    public Lorry(int price, double fuel, int carrying) {
        super(price, fuel);
        this.carrying = carrying;
    }
}
