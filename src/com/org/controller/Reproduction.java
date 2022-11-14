package com.org.controller;

import com.org.Service;
import com.org.model.island.Location;
import com.org.model.island.animals.Animal;

import java.util.*;
import java.util.stream.Collectors;

public class Reproduction {
    private static List<HashSet<? extends Animal>> list = Location.getList();

    public static void localMultiplying() {
        System.out.println(list.size());
        List<HashSet<? extends Animal>> copyList = new ArrayList<>();
        for (HashSet<? extends Animal> set : list) {
            ArrayList<Animal> animals = new ArrayList<>(set);
            ArrayList<Animal> temporal = new ArrayList<>(set);
            System.out.println("size do    " + animals.size());
            for (int i = 0; i < animals.size(); i++) {
                Animal<? extends Animal> animal = animals.get(i).multiply(animals.get(Service.randomTypeOfAnimals(animals.size() - i)));
                if (animal != null) {
                    temporal.add(animal);
                }
            }
            HashSet hashSet = new HashSet(animals);
            System.out.println(hashSet.size() + "animals ********************");
            hashSet.addAll(temporal);
            System.out.println(hashSet.size() + "plus temporal********************");
            System.out.println(hashSet);
            copyList.add(hashSet);
        }
        list = copyList;
        System.out.println(list);
        System.out.println(list.size());
    }


    public static void main(String[] args) {
        AnimalGenerator animalGenerator = new AnimalGenerator();
        animalGenerator.generateIslandPopulation();
        localMultiplying();
    }


}
