package com.pogorelov.hometask3.model;

public class Validation {
    final String REG_NAME = "^[A-Z]{1}[a-z]{1,15}$";
    final String REG_NICKNAME = "^.{1,15}$";
    final String REG_HOME_NUMBER = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    final String REG_MOBILE_NUMBER1 = "^\\+38\\(0[\\d]{2}\\)[\\d]{7}$";
    final String REG_MOBILE_NUMBER2 = "^(\\+38\\(0[\\d]{2}\\)[\\d]{7})|next$";
    final String REG_EMAIL = "^[a-zA-Z\\d][\\w\\.-]{0,15}@[a-zA-Z]{1,10}\\.((com|net|org)(\\.ua)?|ua|ru)$";
    final String REG_SKYPE = "^[a-zA-Z\\d][\\w\\.]{0,20}$";
    final String REG_INDEX = "^[\\d]{5}$";
    final String REG_TOWN = "^[A-Z]{1}[a-zA-Z]{2,15}$";
    final String REG_STREET = "^[A-Z]{1}[a-z]{1,20}$";
    final String REG_HOUSE_NUMBER = "^[\\d]{1,3}(\\/[\\d]{1,2})?[a-z]?$";
    final String REG_APARTMENT_NUMBER = "^[\\d]{1,3}";
}
