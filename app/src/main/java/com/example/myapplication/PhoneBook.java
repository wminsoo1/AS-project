package com.example.myapplication;

public class PhoneBook {

    private String name;
    private String number;

    public PhoneBook(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
