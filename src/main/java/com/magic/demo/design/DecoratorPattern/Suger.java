package com.magic.demo.design.DecoratorPattern;

public class Suger extends CondimentDecorator {
    public Suger(Drink decoratorDrink) {
        super(decoratorDrink);
    }
    @Override
    public int price(){
        return super.price()+5;
    }

    @Override
    public String description() {
        return super.description()+"加上suger真美味！";
    }
}
