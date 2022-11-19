package com.org.model.island.animals;

public class Deer extends Animal {

    @Override
    public Animal<? extends Animal> multiply(Animal animal) {
        return null;
    }

    @Override
    public Class<? extends Animal> eat(int probability) {
        return null;
    }
}
