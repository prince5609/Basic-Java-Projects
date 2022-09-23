package com.PizzaHut;

public class LargeCheesePizza extends VegPizza {
    @Override
    public float price(){
        return 300.0f;
    }

    @Override
    public String name(){
        return "cheesepizza";
    }

    @Override
    public String size(){
        return "large";
    }
}
