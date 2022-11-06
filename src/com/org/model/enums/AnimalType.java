package com.org.model.enums;

public enum AnimalType  {
    WOLF(30),
    DEER(20),
    DUCK(200),
    CATERPILLAR(1000);
   private int maxPopulation;

    AnimalType(int maxPopulation) {
        this.maxPopulation = maxPopulation;
    }

    public int getMaxPopulation() {
        return maxPopulation;
    }
}
