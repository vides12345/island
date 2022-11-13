package com.org.model;

import com.org.Service;
import com.org.model.island.AnimalFactory;
import com.org.model.island.Location;
import com.org.model.island.animals.Animal;
import com.org.model.enums.AnimalType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LocationDAO {
//
//    private List<HashSet<? extends Animals>> list = Location.getList();
//
//    /*
//    Generating initial population of Animals, using Fabric Pattern
//    on Island, giving the name and Gender of Animal on a  List of HashSet<? extends Animals>.
//     */
//    public void generateIslandPopulation() {
//        AnimalType[] values = AnimalType.values();
//        for (AnimalType value : values) {
//            HashSet<? super Animals> animals = new HashSet<>();
//            int numberOfOfAnimals = Service.randomTypeOfAnimals(value.getMaxPopulation());
//            System.out.println("numberOfOfAnimals   " + numberOfOfAnimals);
//            for (int i = 0; i < numberOfOfAnimals; i++) {
//                animals.add(AnimalFactory.createAnimal(value));
//            }
//            list.add((HashSet<? extends Animals>) animals);
//        }
//        System.out.println("Size " + list.size());
//        Location.setList(list);
//        System.out.println(list);
//    }
}
