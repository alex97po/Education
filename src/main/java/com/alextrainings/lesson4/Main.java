package com.alextrainings.lesson4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new PassCar(3500, 9.5, "sedan");
        Car car2 = new Lorry(5000, 15, 35);
        System.out.println(Taxopark.getTaxoparkPrice(car1, car2));
    }
}
