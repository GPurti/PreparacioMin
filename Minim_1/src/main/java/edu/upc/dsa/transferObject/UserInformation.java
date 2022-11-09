package edu.upc.dsa.transferObject;

public class UserInformation {
    String name;
    String surname;
    String date;



    public UserInformation(){}
    public UserInformation(String name, String surname, String date) {
        this();
        this.name = name;
        this.surname = surname;
        this.date = date;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
