package com.pogorelov.hometask3.controller;

import com.pogorelov.hometask3.model.Note;
import com.pogorelov.hometask3.model.Service;
import com.pogorelov.hometask3.model.Validation;
import com.pogorelov.hometask3.view.View;

import java.util.Scanner;

public class Controller {
    private View view;
    private Note model;

    public Controller(View view, Note model) {
        this.view = view;
        this.model = model;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        Service tempNotebook = new Service(model, view, new Validation(view, scanner));
        tempNotebook.saveDataToModel();
    }
}
