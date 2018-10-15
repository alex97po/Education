package com.pogorelov.hometask3.controller;

import com.pogorelov.hometask3.model.Note;
import com.pogorelov.hometask3.view.View;

public class Controller {
    private View view;
    private Note model;

    public Controller(View view, Note model) {
        this.view = view;
        this.model = model;
    }
}
