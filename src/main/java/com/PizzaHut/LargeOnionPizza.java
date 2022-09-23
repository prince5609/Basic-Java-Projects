package com.PizzaHut;

public class LargeOnionPizza extends VegPizza{
    @Override
    public float price(){
        return 220.0f;
    }

    @Override
    public String name(){
        return "onionpizza";
    }

    @Override
    public String size(){
        return "large";
    }
}
