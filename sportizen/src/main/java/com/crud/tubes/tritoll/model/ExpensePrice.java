package com.crud.tubes.tritoll.model;

public enum ExpensePrice {
    PAGI(100000), SIANG(120000), SORE(130000), MALAM(150000);

    private double Price;

    private ExpensePrice(double Price) {
        this.Price = Price;
    }
    public double getPrice() {
        return Price;
    }
}