package com.pogorelov.hometask3.model;

import com.pogorelov.hometask3.view.View;

import java.util.Scanner;

public class Validation {
    public static final String REG_NAME = "^[A-Z]{1}[a-z]{1,15}$";
    public static final String REG_NICKNAME = "^.{1,15}$";
    public static final String REG_HOME_NUMBER = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    public static final String REG_MOBILE_NUMBER1 = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    public static final String REG_MOBILE_NUMBER2 = "^(\\+38\\(0[\\d]{2}\\)[\\d]{7})|next$";
    public static final String REG_EMAIL = "^[a-zA-Z\\d][\\w\\.-]{0,15}@[a-zA-Z]{1,10}\\.((com|net|org)(\\.ua)?|ua|ru)$";
    public static final String REG_SKYPE = "^[a-zA-Z\\d][\\w\\.]{0,20}$";
    public static final String REG_INDEX = "^[\\d]{5}$";
    public static final String REG_TOWN = "^[A-Z]{1}[a-zA-Z]{2,15}$";
    public static final String REG_STREET = "^[A-Z]{1}[a-z]{1,20}$";
    public static final String REG_HOUSE_NUMBER = "^[\\d]{1,3}(\\/[\\d]{1,2})?[a-z]?$";
    public static final String REG_APARTMENT_NUMBER = "^[\\d]{1,3}";

    private View view;
    private Scanner scanner;

    public Validation(View view, Scanner scanner) {
        this.scanner = scanner;
        this.view = view;
    }

    public String validation(String regex) {
        String value = scanner.nextLine();
        while (!(value.matches(regex))) {
            view.showWrongInput();
            value = scanner.nextLine();
        }
        return value;
    }
}
