package com.company;

public class Macaroons extends BakedGoods {
    private int numOfMacaroons;
    private String flavors;
    private double price;
    private String color;

    public int getNumOfMacaroon() {
        return numOfMacaroons;
    }

    public String getColor() {
        return color;
    }

    public String getFlavors() {
        return flavors;
    }

    public double getPrice() {
        return price;
    }

    public Macaroons(int numOfMacaroons, String flavors, double price, boolean freshDaily, boolean isGlutenFree) {
        super(freshDaily, isGlutenFree);
        this.numOfMacaroons = numOfMacaroons;
        this.flavors = flavors;
        this.price = price;
    }

    @Override
    void Print() {
        super.Print();
        System.out.println("This macaroon is the following" + numOfMacaroons +'\n' + color+ '\n' + flavors + '\n' + +'\n' + price);
    }
}
