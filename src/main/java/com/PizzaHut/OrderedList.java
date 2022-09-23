package com.PizzaHut;

import java.util.ArrayList;

public class OrderedList {
    ArrayList<Item> list = new ArrayList<>();

    public void addItem(Item item){
        list.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : list){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : list){
            System.out.println("Item Is :" + item.name());
            System.out.println("Size Is : " + item.size());
            System.out.println("Cost Is : " + item.price());
        }
    }
}
