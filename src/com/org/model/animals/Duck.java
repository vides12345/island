package com.org.model.animals;

import com.org.model.interfaces.Carnivores;
import com.org.model.interfaces.Herbivores;
import com.org.model.vegetable.Vegatable;

public class Duck extends Animals implements Carnivores, Herbivores {
    private static int weight =1;
//    private static int maxPopulation=200;
    private static int speedByCell=4;
    private static double foodRequired=0.15;

    @Override
    void multiply(Animals animalsF, Animals animalsM) {

    }

    @Override
    void moveInToDirecction() {

    }

    @Override
    public void eatMeat(Herbivores herbivores) {

    }

    @Override
    public void eatVeggie(Vegatable vegatable) {

    }
}
