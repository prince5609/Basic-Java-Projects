package com.PizzaHut;

public class SmallNonVegPizza extends NonVegPizza{

    @Override
    public float price(){
        return 180.0f;
    }

    @Override
    public String name(){
        return "nonvegpizza";
    }

    @Override
    public String size(){
        return "small";
    }
}
