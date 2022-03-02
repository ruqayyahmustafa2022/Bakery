package com.company;

public class People {
    private String title; // customer or cashier
    private String name;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public People (String title, String name) {
        this.title = title;
        this.name = name;
    }
}
