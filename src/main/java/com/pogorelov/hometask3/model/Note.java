package com.pogorelov.hometask3.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Note {
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
    private String dateOfChange;

    public void setLoginToEnum() throws NotUniqueLoginException {
        DataBaseWithEnum.Note1.setLogin(nickName);
        DataBaseWithEnum.Note2.setLogin(nickName);
        DataBaseWithEnum.Note3.setLogin(nickName);
        DataBaseWithEnum.Note4.setLogin(nickName);
    }
}
