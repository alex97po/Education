package com.shrekos.lesson4;

public class Taxopark {
    public static int getTaxoparkPrice (Car passCar, Car lorry) {
        return passCar.getPrice() + lorry.getPrice();
    }
}