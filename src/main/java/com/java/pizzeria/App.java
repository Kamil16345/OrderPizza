package com.java.pizzeria;

import com.java.api.IOrder;
import com.java.config.Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        IOrder order = (IOrder)context.getBean("order");
        order.printOrder();
    }

}
