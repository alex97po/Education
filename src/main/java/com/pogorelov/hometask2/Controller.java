package com.pogorelov.hometask2;

public class Controller {
    private MoreOrLess model;
    private View view;

    public Controller(MoreOrLess model, View view) {
        this.model = model;
        this.view = view;
    }

    public void runner() {
        int result = model.moreless();
        view.output(result);
    }
}

