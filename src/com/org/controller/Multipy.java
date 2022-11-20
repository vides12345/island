package com.org.controller;

import com.org.Service;
import com.org.model.island.Location;
import com.org.model.island.animals.Animal;

import java.util.*;

public class Multipy {
    private static List<HashSet<? extends Animal>> list = Location.getList();
/*for each Location,  take a group of similar animals from HashSet
and find pair of F and M. if we found we call Factory to create new instance
and add to respectively HashSet
 */

    public static void localMultiplying() {
        List<HashSet<? extends Animal>> copyList = new ArrayList<>();
        for (HashSet<? extends Animal> set : list) {
            ArrayList<Animal> animals = new ArrayList<>(set);
            ArrayList<Animal> temporal = new ArrayList<>();
            for (int i = 0; i < animals.size(); i++) {
                Animal<? extends Animal> animal = animals.get(i).multiply(animals.get(Service.randomTypeOfAnimals(animals.size() - i)));
                if (animal != null) {
                    temporal.add(animal);
                }
            }
            HashSet hashSet = new HashSet(animals);
            hashSet.addAll(temporal);
            System.out.println("Size of new HashSet  "+hashSet.size());
            copyList.add(hashSet);
            System.out.println(copyList);
        }
        list = copyList;
    }

    public static void main(String[] args) {
        AnimalGenerator animalGenerator = new AnimalGenerator();
        animalGenerator.generateIslandPopulation();
        localMultiplying();
    }
}
