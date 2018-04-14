package com.magic.demo.design.DecoratorPattern;

public class CoffieShop {
    public static void main(String[] args) {
        Coffie c=new Coffie();
        c.setPrice(10);
        c.setDescription("卡布基诺真好喝");
        Drink suger=new Suger(c);
        System.out.println(suger.description()+"----------"+suger.price());
    }


}
