package com.pogorelov.hometask2;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        MoreOrLess model = new MoreOrLess();

        Controller controller = new Controller(model, view);
        controller.runner();
    }

}
