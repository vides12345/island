package com.org.controller;

import com.org.Service;
import com.org.model.enums.AnimalType;
import com.org.model.island.Location;
import com.org.model.island.animals.Animal;
import com.org.model.island.animals.Caterpillar;
import com.org.model.island.animals.Duck;

import java.lang.reflect.Method;
import java.util.*;

public class Reproduction {
    private static List<HashSet<? extends Animal>> list = Location.getList();

    public static void localMultiplying() {
        for (HashSet<? extends Animal> set : list) {
            ArrayList<? extends Animal> animals = new ArrayList<>(set);
            for (int i = 0; i < animals.size() / 2; i++) {
                animals.get(i).multiply(animals.get(Service.randomTypeOfAnimals(animals.size()-1-i)));
            }
        }
    }


    public static void main(String[] args) {
        AnimalGenerator animalGenerator = new AnimalGenerator();
        animalGenerator.generateIslandPopulation();
        localMultiplying();
    }


}
