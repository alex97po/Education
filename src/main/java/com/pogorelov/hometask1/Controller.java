package com.pogorelov.hometask1;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void runner() {
        String result = model.add();
        view.output(result);
    }
}