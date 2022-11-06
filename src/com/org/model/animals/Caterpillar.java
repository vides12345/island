package com.org.model.animals;

import com.org.model.enums.Gender;
import com.org.model.interfaces.Herbivores;
import com.org.model.vegetable.Vegatable;

public class Caterpillar extends Animals implements Herbivores {
    private static double weight=0.01;
//    private static int maxPopulation=1000;
    private static int speedByCell=0;
    private static double foodRequired=0;
    private static int quantityOfCaterpillars = 0;



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
