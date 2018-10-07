package com.pogorelov.hometask1;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Viewer view = new Viewer();
        Controller controller = new Controller(model, view);
        controller.runner();

    }

}
