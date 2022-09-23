package com.PizzaHut;

public class SmallOnionPizza extends VegPizza{
    @Override
    public float price(){
        return 120.0f;
    }

    @Override
    public String name(){
        return "onionpizza";
    }

    @Override
    public String size(){
        return "small";
    }
}
