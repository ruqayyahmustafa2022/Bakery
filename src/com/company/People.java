package com.company;

public class People {
    private String title; // customer or cashier


    public String getTitle() {
        return title;
    }

    public People (String title) {
        this.title = title;
    }

    void Print() {
        System.out.println(title);
    }
}
