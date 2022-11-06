package com.org.model.animals;

import com.org.model.interfaces.Carnivores;
import com.org.model.interfaces.Herbivores;

public class Wolf extends Animals implements Carnivores {
    private static  int weight =50;
    private static int maxPopulation=30;
    private static int speedByCell=3;
    private static double foodRequired=8;
    @Override
    void multiply(Animals animalsF, Animals animalsM) {

    }

    @Override
    void moveInToDirecction() {

    }


    @Override
    public void eatMeat(Herbivores herbivores) {

    }
}
