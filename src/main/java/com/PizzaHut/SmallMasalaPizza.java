package com.PizzaHut;

public class SmallMasalaPizza extends VegPizza{

    @Override
    public float price(){
        return 100.0f;
    }

    @Override
    public String name(){
        return "masalapizza";
    }

    @Override
    public String size(){
        return "small";
    }
}
