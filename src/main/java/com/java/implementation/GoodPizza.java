package com.java.implementation;

import com.java.api.IPizza;

public class GoodPizza implements IPizza {
    private int price;
    private String name;

    public GoodPizza(int price, String name){
        super();
        this.price=price;
        this.name=name;
    }
}
