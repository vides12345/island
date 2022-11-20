package com.org.controller;

import com.org.Service;
import com.org.model.enums.AnimalType;
import com.org.model.island.AnimalFactory;
import com.org.model.island.Location;
import com.org.model.island.animals.Animal;

import java.util.HashSet;
import java.util.List;

public class AnimalGenerator {
    private List<HashSet<? extends Animal>> list = Location.getList();

    /*
    Generating initial population of Animals, using Fabric Pattern
    on Island, giving the name and Gender of Animal on a  List of HashSet<? extends Animals>.
     */
    public void generateLocationPopulation() {
        AnimalType[] values = AnimalType.values();
        for (AnimalType value : values) {
            HashSet<? super Animal> animals = new HashSet<>();
            int numberOfOfAnimals = Service.randomTypeOfAnimals(value.getMaxPopulation());
            System.out.println("numberOfOfAnimals   " + numberOfOfAnimals);
            //Use Enum to create all type of Island animals
            for (int i = 0; i < numberOfOfAnimals; i++) {
                animals.add(AnimalFactory.createAnimal(value));
            }
            list.add((HashSet<? extends Animal>) animals);
        }
        System.out.println("Type of Animals " + list.size());
        Location.setList(list);
        System.out.println(list);
    }


}
