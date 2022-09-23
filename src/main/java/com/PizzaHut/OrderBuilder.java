package com.PizzaHut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {
    public OrderedList preparePizza() throws IOException{
        OrderedList itemOrder = new OrderedList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Choice Of Items : ");
        System.out.println("========================");
        System.out.println("Press 1 For VegPizza");
        System.out.println("Press 2 For NonVegPizza");
        int pizzaChoice = Integer.parseInt(br.readLine());
        switch (pizzaChoice){
            case 1:
                System.out.println("You Ordered VegPizza");
                System.out.println("========================");
                System.out.println("Enter Choice Of VegPizza");
                System.out.println("Press 1 For CheesePizza");
                System.out.println("Press 2 For MasalaPiazza");
                System.out.println("Press 3 For OnionPizza");
                int vegPizzaChoice = Integer.parseInt(br.readLine());
                switch(vegPizzaChoice){
                    case 1:
                        System.out.println("You Ordered CheesePizza");
                        System.out.println("========================");
                        System.out.println("Enter The Size OF Your Cheese Pizza");
                        System.out.println("Press 1 For Small");
                        System.out.println("Press 2 For Medium");
                        System.out.println("Press 3 For Large");
                        int cheesePizzaSize = Integer.parseInt(br.readLine());
                        switch (cheesePizzaSize){
                            case 1:
                                System.out.println("You Ordered Small Size Cheese Veg Pizza");
                                itemOrder.addItem(new SmallCheesePizza());
                                break;
                            case 2:
                                System.out.println("You Ordered Medium Size Cheese Veg Pizza");
                                itemOrder.addItem(new MediumCheesePizza());
                                break;
                            case 3:
                                System.out.println("You Ordered Medium Size Cheese Veg Pizza");
                                itemOrder.addItem(new LargeCheesePizza());
                                break;
                            default:{
                                break;
                            }
                        }
                    break;
                    case 2:
                        System.out.println("You Ordered MasalaPizza");
                        System.out.println("========================");
                        System.out.println("Enter The Size OF Your Masala Pizza");
                        System.out.println("Press 1 For Small");
                        System.out.println("Press 2 For Medium");
                        System.out.println("Press 3 For Large");
                        int masalaPizzaSize = Integer.parseInt(br.readLine());
                        switch (masalaPizzaSize){
                            case 1:
                                System.out.println("You Ordered Small Size Masala Veg Pizza");
                                itemOrder.addItem(new SmallMasalaPizza());
                                break;
                            case 2:
                                System.out.println("You Ordered Medium Size Masala Veg Pizza");
                                itemOrder.addItem(new MediumMasalaPizza());
                                break;
                            case 3:
                                System.out.println("You Ordered Medium Size Masala Veg Pizza");
                                itemOrder.addItem(new LargeMasalaPizza());
                                break;
                            default:{
                                break;
                            }
                        }
                    break;
                    case 3:
                        System.out.println("You Ordered OnionPizza");
                        System.out.println("========================");
                        System.out.println("Enter The Size OF Your Onion Pizza");
                        System.out.println("Press 1 For Small");
                        System.out.println("Press 2 For Medium");
                        System.out.println("Press 3 For Large");
                        int onionPizzaSize = Integer.parseInt(br.readLine());
                        switch (onionPizzaSize) {
                            case 1:
                                System.out.println("You Ordered Small Size Onion Veg Pizza");
                                itemOrder.addItem(new SmallOnionPizza());
                                break;
                            case 2:
                                System.out.println("You Ordered Medium Size Onion Veg Pizza");
                                itemOrder.addItem(new MediumOnionPizza());
                                break;
                            case 3:
                                System.out.println("You Ordered Medium Size Onion Veg Pizza");
                                itemOrder.addItem(new LargeOnionPizza());
                                break;
                            default:{
                                break;
                            }
                        }
                    break;
                    default:{
                        break;
                    }
                }
            break;
            case 2:
                System.out.println("You Have Ordered NonVegPizza");
                System.out.println("========================");
                System.out.println("Enter The Size OF Your Non Veg Pizza");
                System.out.println("Press 1 For Small");
                System.out.println("Press 2 For Medium");
                System.out.println("Press 3 For Large");
                int nonVegPizzaSize = Integer.parseInt(br.readLine());
                switch (nonVegPizzaSize) {
                    case 1:
                        System.out.println("You Ordered Small Size Non Veg Pizza");
                        itemOrder.addItem(new SmallNonVegPizza());
                        break;
                    case 2:
                        System.out.println("You Ordered Medium Size Non Veg Pizza");
                        itemOrder.addItem(new MediumNonVegPizza());
                        break;
                    case 3:
                        System.out.println("You Ordered Medium Size Non Veg Pizza");
                        itemOrder.addItem(new LargeNonVegPizza());
                        break;
                    default:{
                        break;
                    }
                }
            break;
            default:{
                break;
            }
        }

        System.out.println("Enter The Choice OF ColdDrink");
        System.out.println("============================");
        System.out.println("Press 1 For Pepsi");
        System.out.println("Press 2 For Coke");
        int pepsiColdDrink = Integer.parseInt(br.readLine());
        switch(pepsiColdDrink){
            case 1:
                System.out.println("You Have Ordered Pepsi");
                System.out.println("============================");
                System.out.println("Enter The Choice Of Pepsi");
                System.out.println("Press 1 For Dew");
                System.out.println("Press 2 For Pepsi");
                int pepsi = Integer.parseInt(br.readLine());
                switch(pepsi){
                    case 1:
                        System.out.println("You Have Ordered Dew");
                        System.out.println("============================");
                        System.out.println("Enter The Size Of Dew");
                        System.out.println("Press 1 For Small");
                        System.out.println("Press 2 For Medium");
                        System.out.println("Press 3 For Large");
                        int dewSize = Integer.parseInt(br.readLine());
                        switch(dewSize){
                            case 1:
                                System.out.println("You Have Ordered Small Dew");
                                itemOrder.addItem(new SmallDew());
                                break;
                            case 2:
                                System.out.println("You Have Ordered Medium Dew");
                                itemOrder.addItem(new MediumDew());
                                break;
                            case 3:
                                System.out.println("You Have Ordered Large Dew");
                                itemOrder.addItem(new LargeDew());
                                break;
                            default:{
                                break;
                            }
                        }
                    case 2:
                        System.out.println("You Have Ordered Pepsi");
                        System.out.println("============================");
                        System.out.println("Enter The Size Of Pepsi");
                        System.out.println("Press 1 For Small");
                        System.out.println("Press 2 For Medium");
                        System.out.println("Press 3 For Large");
                        int pepsiSize = Integer.parseInt(br.readLine());
                        switch(pepsiSize){
                            case 1:
                                System.out.println("You Have Ordered Small Pepsi");
                                itemOrder.addItem(new SmallPepsi());
                                break;
                            case 2:
                                System.out.println("You Have Ordered Medium Pepsi");
                                itemOrder.addItem(new MediumPepsi());
                                break;
                            case 3:
                                System.out.println("You Have Ordered Large Pepsi");
                                itemOrder.addItem(new LargePepsi());
                                break;
                            default:{
                                break;
                            }
                        }
                    default:{
                        break;
                    }
                }
            case 2:
                System.out.println("You Have Ordered Coke");
                System.out.println("============================");
                System.out.println("Enter The Choice Of Coke");
                System.out.println("Press 1 For Thumsup");
                System.out.println("Press 2 For Fanta");
                int coke = Integer.parseInt(br.readLine());
                switch(coke){
                    case 1:
                        System.out.println("You Have Ordered Thumsup");
                        System.out.println("============================");
                        System.out.println("Enter The Size Of Thumsup");
                        System.out.println("Press 1 For Small");
                        System.out.println("Press 2 For Medium");
                        System.out.println("Press 3 For Large");
                        int thumsupSize = Integer.parseInt(br.readLine());
                        switch(thumsupSize){
                            case 1:
                                System.out.println("You Have Ordered Small Thumsup");
                                itemOrder.addItem(new SmallThumsup());
                                break;
                            case 2:
                                System.out.println("You Have Ordered Medium thumsup");
                                itemOrder.addItem(new MediumThumsup());
                                break;
                            case 3:
                                System.out.println("You Have Ordered Large Thumsup");
                                itemOrder.addItem(new LargeThumsup());
                                break;
                            default:{
                                break;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("You Have Ordered Fanta");
                        System.out.println("============================");
                        System.out.println("Enter The Size Of Fanta");
                        System.out.println("Press 1 For Small");
                        System.out.println("Press 2 For Medium");
                        System.out.println("Press 3 For Large");
                        int fantaSize = Integer.parseInt(br.readLine());
                        switch(fantaSize){
                            case 1:
                                System.out.println("You Have Ordered Small Fanta");
                                itemOrder.addItem(new SmallFanta());
                                break;
                            case 2:
                                System.out.println("You Have Ordered Medium Fanta");
                                itemOrder.addItem(new MediumFanta());
                                break;
                            case 3:
                                System.out.println("You Have Ordered Large Fanta");
                                itemOrder.addItem(new LargeFanta());
                                break;
                            default:{
                                break;
                            }
                        }
                    default:{
                        break;
                    }
                }
            default:{
                break;
            }
        }
        return itemOrder;
    }
}
