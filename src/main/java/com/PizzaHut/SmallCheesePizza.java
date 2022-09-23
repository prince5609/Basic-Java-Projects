package com.PizzaHut;

public class SmallCheesePizza extends VegPizza {

    @Override
    public float price(){
        return 170.0f;
    }

    @Override
    public String name(){
        return "cheesepizza";
    }

    @Override
    public String size(){
        return "small";
    }
}
