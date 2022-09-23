package com.PizzaHut;

public class SmallFanta extends Coke{

    @Override
    public String name(){
        return "fanta";
    }

    @Override
    public String size(){
        return "small";
    }

    @Override
    public float price(){
        return 20.f;
    }
}
