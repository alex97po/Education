package com.pogorelov.hometask3.model;

public class NotUniqueLoginException extends Exception {

    NotUniqueLoginException() {
        super("Login already exists, try again: ");
    }

}
