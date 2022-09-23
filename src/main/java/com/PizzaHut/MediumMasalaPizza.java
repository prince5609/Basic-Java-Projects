package com.PizzaHut;

public class MediumMasalaPizza extends  VegPizza{
    @Override
    public float price(){
        return 150.0f;
    }

    @Override
    public String name(){
        return "masalapizza";
    }

    @Override
    public String size(){
        return "medium";
    }
}
