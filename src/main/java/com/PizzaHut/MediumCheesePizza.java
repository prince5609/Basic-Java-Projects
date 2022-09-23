package com.PizzaHut;

public class MediumCheesePizza extends VegPizza{

    @Override
    public float price(){
        return 220.0f;
    }

    @Override
    public String name(){
        return "cheesepizza";
    }

    @Override
    public String size(){
        return "medium";
    }
}
