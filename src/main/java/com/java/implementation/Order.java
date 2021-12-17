package com.java.implementation;

import com.java.api.IOrder;
import com.java.api.IPizza;

public class Order implements IOrder {
    private IPizza pizza;

    public Order(IPizza pizza){
        super();
        this.pizza=pizza;
    }

    @Override
    public void printOrder() {
        System.out.println("Order "+pizza.getName()+" costs "+pizza.getPrice());
    }
}
