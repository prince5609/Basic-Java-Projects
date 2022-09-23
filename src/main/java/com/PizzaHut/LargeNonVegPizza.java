package com.PizzaHut;

public class LargeNonVegPizza extends NonVegPizza {

    @Override
    public float price(){
        return 260.0f;
    }

    @Override
    public String name(){
        return "nonvegpizza";
    }

    @Override
    public String size(){
        return "large";
    }
}
