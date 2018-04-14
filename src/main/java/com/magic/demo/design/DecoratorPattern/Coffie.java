package com.magic.demo.design.DecoratorPattern;

public class Coffie implements  Drink{
   private String description;
   private int price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public String description() {
        return description;
    }
}
