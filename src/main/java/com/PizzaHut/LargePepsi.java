package com.PizzaHut;

public class LargePepsi extends Pepsi{

    @Override
    public String name(){
        return "pepsi";
    }

    @Override
    public String size(){
        return "large";
    }

    @Override
    public float price(){
        return 60.f;
    }
}
