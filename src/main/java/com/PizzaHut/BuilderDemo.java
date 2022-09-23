package com.PizzaHut;

import java.io.IOException;

public class BuilderDemo {
    public static void main(String[] args) throws IOException{
        OrderBuilder builder = new OrderBuilder();
        OrderedList orderedlist = builder.preparePizza();
        orderedlist.showItems();
        System.out.println("Total Cost : " + orderedlist.getCost());
    }
}
