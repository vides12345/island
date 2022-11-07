package com.org.model.enums;

public enum AnimalType  {
    WOLF(10),//30
    DEER(10),//20
    DUCK(10),//200
    CATERPILLAR(100);//1000
   private int maxPopulation;

    AnimalType(int maxPopulation) {
        this.maxPopulation = maxPopulation;
    }

    public int getMaxPopulation() {
        return maxPopulation;
    }
}
