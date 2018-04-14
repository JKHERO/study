package com.magic.demo.design.DecoratorPattern;

public  class CondimentDecorator implements Drink{
    protected  Drink decoratorDrink;

    public CondimentDecorator(Drink decoratorDrink) {
        this.decoratorDrink = decoratorDrink;
    }
    @Override
    public int price() {
        return decoratorDrink.price();
    }

    @Override
    public String description() {
        return decoratorDrink.description();
    }
}
