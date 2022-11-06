package com.org.model.animals;

import com.org.model.interfaces.Herbivores;
import com.org.model.vegetable.Vegatable;

public class Deer extends  Animals implements Herbivores {
    private static int weight =300;
    private static int maxPopulation=20;
    private static int speedByCell=4;
    private static double foodRequired=50;


    @Override
    void multiply(Animals animalsF, Animals animalsM) {

    }

    @Override
    void moveInToDirecction() {

    }

    @Override
    public void eatVeggie(Vegatable vegatable) {

    }
}
