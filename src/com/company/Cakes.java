package com.company;

public class Cakes extends BakedGoods{
    private int noOfLayers;
    private String cakeSize; //small or large
    private String cakeFlavor;
    private String fillingFlavor;
    private String frostingType; //buttercream or fondant
    private double price;

    public int getNoOfLayers() {
        return noOfLayers;
    }

    public String getCakeSize() {
        return cakeSize;
    }

    public String getCakeFlavor() {
        return cakeFlavor;
    }

    public String getFillingFlavor() {
        return fillingFlavor;
    }

    public String getFrostingType() {
        return frostingType;
    }

    public double getPrice() {
        return price;
    }

    public Cakes(int noOfLayers, String cakeSize, String cakeFlavor, String fillingFlavor, String frostingType,
                 double price, boolean freshDaily, boolean isGlutenFree ){

        super(freshDaily, isGlutenFree);
        this.noOfLayers = noOfLayers;
        this.cakeSize = cakeSize;
        this.cakeFlavor = cakeFlavor;
        this.fillingFlavor = fillingFlavor;
        this.frostingType = frostingType;
        this.price = price;

    }

    @Override
    void Print() {
        super.Print();
        System.out.println("This cake is the following: \n" + noOfLayers + " layer " + cakeSize + '\n' +cakeFlavor
                + '\n' +fillingFlavor + '\n' +frostingType + '\n' + price);
    }
}
