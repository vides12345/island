package com.org.controller;

public class Service {
    private static   int animalCounts = 0;
    private static   int bornNewAnimals = 0;
    private static   int deathAnimals = 0;
    private static   int maleAnimals = 0;
    private static   int femmeAnimals = 0;
    private static   int vegetable = 0;

    public static int getAnimalCounts() {
        return animalCounts;
    }

    public static int getBornNewAnimals() {
        return bornNewAnimals;
    }

    public static int getDeathAnimals() {
        return deathAnimals;
    }

    public static int getMaleAnimals() {
        return maleAnimals;
    }

    public static int getFemmeAnimals() {
        return femmeAnimals;
    }

    public static int getVegetable() {
        return vegetable;
    }
}
