package com.pogorelov.hometask3.model;

import com.pogorelov.hometask3.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Service {
    private View view;
    private Note model;
    private Validation validation;

    private String name;
    private String surname;
    private String patronymic;
    private String shortInitials;
    private String nickName;
    private String homeNumber;
    private String mobileNumber1;
    private String mobileNumber2;
    private String email;
    private String skype;
    private String index;
    private String town;
    private String street;
    private String houseNumber;
    private String apartmentNumber;
    private String homeAddress;
    private String dateOfCreation;

    public Service(Note model, View view, Validation validation) {
        this.view = view;
        this.model = model;
        this.validation = validation;
    }

    public void saveDataToModel() {
        saveInputData();
        model.setName(name);
        model.setSurname(surname);
        model.setPatronymic(patronymic);
        model.setShortInitials(shortInitials);
        model.setNickName(nickName);
        model.setHomeNumber(homeNumber);
        model.setMobileNumber1(mobileNumber1);
        model.setMobileNumber2(mobileNumber2);
        model.setEmail(email);
        model.setSkype(skype);
        model.setIndex(index);
        model.setTown(town);
        model.setStreet(street);
        model.setHouseNumber(houseNumber);
        model.setApartmentNumber(apartmentNumber);
        model.setHomeAddress(homeAddress);
        model.setDateOfCreation(dateOfCreation);
    }

    private void saveInputData() {
        view.inputName();
        name = validation.validation(Validation.REG_NAME);
        view.inputSurname();
        surname = validation.validation(Validation.REG_NAME);
        view.inputPatronymic();
        patronymic = validation.validation(Validation.REG_NAME);
        StringBuilder sb = new StringBuilder();
        char firstLetter = name.charAt(0);
        sb.append(surname)
                .append(" ")
                .append(firstLetter)
                .append(".");
        shortInitials = sb.toString();
        view.inputNickname();
        nickName = validation.validation(Validation.REG_NICKNAME);
        view.inputHomeNumber();
        homeNumber = validation.validation(Validation.REG_HOME_NUMBER);
        view.inputMobileNumber1();
        mobileNumber1 = validation.validation(Validation.REG_MOBILE_NUMBER1);
        view.inputMobileNumber2();
        mobileNumber2 = validation.validation(Validation.REG_MOBILE_NUMBER2);
        view.inputEmail();
        email = validation.validation(Validation.REG_EMAIL);
        view.inputSkype();
        skype = validation.validation(Validation.REG_SKYPE);
        view.inputIndex();
        index = validation.validation(Validation.REG_INDEX);
        view.inputTown();
        town = validation.validation(Validation.REG_TOWN);
        view.inputStreet();
        street = validation.validation(Validation.REG_STREET);
        view.inputHouseNumber();
        houseNumber = validation.validation(Validation.REG_HOUSE_NUMBER);
        view.inputApartmentNumber();
        apartmentNumber = validation.validation(Validation.REG_APARTMENT_NUMBER);
        StringBuilder sb1 = new StringBuilder();
        String coma = ", ";
        sb1.append(index)
                .append(coma)
                .append(town)
                .append(coma)
                .append(street)
                .append(coma)
                .append(houseNumber)
                .append(coma)
                .append(apartmentNumber);
        homeAddress = sb1.toString();
        saveDateOfCreation();
    }

    private void saveDateOfCreation() {
        Date date = new Date();
        String pattern = "dd.mm.yyyy hh:mm";
        SimpleDateFormat simpleDate = new SimpleDateFormat(pattern);
        dateOfCreation = simpleDate.format(date);
    }
}
