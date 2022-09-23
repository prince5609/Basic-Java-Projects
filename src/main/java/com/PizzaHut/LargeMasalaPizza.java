package com.PizzaHut;

public class LargeMasalaPizza extends VegPizza{

    @Override
    public float price(){
        return 200.0f;
    }

    @Override
    public String name(){
        return "masalapizza";
    }

    @Override
    public String size(){
        return "large";
    }
}
