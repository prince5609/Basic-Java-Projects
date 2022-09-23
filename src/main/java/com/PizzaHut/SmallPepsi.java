package com.PizzaHut;

public class SmallPepsi extends Pepsi{

    @Override
    public String name(){
        return "pepsi";
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
