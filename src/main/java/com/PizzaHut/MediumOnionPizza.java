package com.PizzaHut;

public class MediumOnionPizza extends VegPizza{
    @Override
    public float price(){
        return 160.0f;
    }

    @Override
    public String name(){
        return "onionpizza";
    }

    @Override
    public String size(){
        return "medium";
    }
}
