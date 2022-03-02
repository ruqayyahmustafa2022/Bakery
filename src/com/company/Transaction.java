package com.company;

public class Transaction {
    private double cashAvailable;
    private double amtInRegister;
    private double totalCost;


    public void setAmtInRegister(double amtInRegister) {
        this.amtInRegister = amtInRegister;
    }

    public double getAmtInRegister() {
        return amtInRegister;
    }

    public void setCashAvailable(double cashAvailable) {
        this.cashAvailable = cashAvailable;
    }
    public double getCashAvailable() {
        return cashAvailable;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double CalculatePurchase(double price, double quantity) {
        totalCost = price * quantity;
        return totalCost;
    }
}
