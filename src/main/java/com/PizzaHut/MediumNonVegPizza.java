package com.PizzaHut;

public class MediumNonVegPizza extends NonVegPizza{

    @Override
    public float price(){
        return 230.0f;
    }

    @Override
    public String name(){
        return "nonvegpizza";
    }

    @Override
    public String size(){
        return "medium";
    }
}
