package com.company;

public class Cupcakes extends BakedGoods{
    private int numOfCupcakes;
    private String flavors;
    private double price;

    public int getNumOfCupcakes() {
        return numOfCupcakes;
    }

    public String getFlavors() {
        return flavors;
    }

    public double getPrice() {
        return price;
    }

    public Cupcakes (int numOfCupcakes, String flavors, double price, boolean freshDaily, boolean isGlutenFree) {
        super(freshDaily, isGlutenFree);
        this.numOfCupcakes = numOfCupcakes;
        this.flavors = flavors;
        this.price = price;
    }

    @Override
    void Print() {
        super.Print();
        System.out.println("This cupcake is the following" + numOfCupcakes + '\n' + flavors + '\n' + price);
    }
}
