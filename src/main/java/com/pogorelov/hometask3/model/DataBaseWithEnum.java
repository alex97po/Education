package com.pogorelov.hometask3.model;

public enum DataBaseWithEnum {
    Note1 ("taras123"),
    Note2 ("nik12345"),
    Note3 ("shoko123"),
    Note4 ();

    private String login;

    DataBaseWithEnum() {

    }

    DataBaseWithEnum(String login) {
        this.login = login;
    }

    public void setLogin(String login) throws NotUniqueLoginException {
        for (DataBaseWithEnum temp : DataBaseWithEnum.values()) {
            if (login == null || login.equals(temp.getLogin())) {
                throw new NotUniqueLoginException();
            }
        }
        this.login = login;
    }

    public String getLogin() {
        return this.login;
    }
}
