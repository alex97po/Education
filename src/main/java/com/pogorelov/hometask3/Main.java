package com.pogorelov.hometask3;

import com.pogorelov.hometask3.controller.Controller;
import com.pogorelov.hometask3.model.Note;
import com.pogorelov.hometask3.view.View;

public class Main {
    public static void main(String[] args) {
        Note model = new Note();
        View view = new View();

        Controller controller = new Controller(view, model);
        controller.processUser();
    }
}
