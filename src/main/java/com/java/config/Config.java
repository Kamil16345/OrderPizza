package com.java.config;

import com.java.api.IOrder;
import com.java.api.IPizza;
import com.java.implementation.Order;

import com.java.implementation.GoodPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class Config {
    @Bean
    public IPizza pizza(){
        return new GoodPizza(15, "GoodPizza");
    }
    @Bean
    public IOrder order(IPizza pizza){
        return new Order(pizza);
    }
}
