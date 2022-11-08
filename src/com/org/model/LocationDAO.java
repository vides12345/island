package com.org.model;

import com.org.Service;
import com.org.model.island.AnimalFactory;
import com.org.model.island.animals.Animals;
import com.org.model.enums.AnimalType;

import java.util.ArrayList;
import java.util.List;

public class LocationDAO {
    ModelDAO modelDAO = new ModelDAO();

    /*
    Generating initial population of Animals, using Fabric Pattern
    on Island, giving the name and Gender of Animal on a  List of List<? extends Animals>.
     */
    public List<List<? extends Animals>> generateIslandPopulation() {
        List<List<? extends Animals>> list = new ArrayList<>();

        AnimalType[] values = AnimalType.values();
        for (AnimalType value : values) {
            List<? super Animals> animals = new ArrayList<>();
            int numberOfOfAnimals = Service.randomTypeOfAnimals(value.getMaxPopulation());
            for (int i = 0; i < numberOfOfAnimals; i++) {
                animals.add(AnimalFactory.createAnimal(value));
            }
            list.add((List<? extends Animals>) animals);
        }
        return list;
    }


    public static void main(String[] args) {
        LocationDAO locationDAO = new LocationDAO();
        System.out.println("Initial Population");
        System.out.println(locationDAO.generateIslandPopulation());
    }

}
