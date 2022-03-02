package com.company;

public class Cookies extends BakedGoods{
    private int numOfCookies;
    private String flavors;
    private double price;

    public int getNumOfCookies() {
        return numOfCookies;
    }

    public String flavors() {
        return flavors;
    }

    public double price() {
        return price;
    }
    public Cookies(int numOfCookies, String flavors, double price, boolean freshDaily, boolean isGlutenFree){
        super(freshDaily, isGlutenFree);
        this.numOfCookies = numOfCookies;
        this.flavors = flavors;
        this.price = price;
    }

    @Override
    void Print() {
        super.Print();
        System.out.println("This cookie is the following \n" + flavors + "\n" + price);
    }
}
