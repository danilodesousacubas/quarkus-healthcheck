package org.quarkus.modules.service;

import javax.enterprise.context.ApplicationScoped;

import org.quarkus.modules.model.Fruit;

@ApplicationScoped 
public class FruitService {
    public Fruit getFruit(){
        Fruit fruit = new Fruit();
        fruit.setName("Name it works");
        return fruit;
    }
}