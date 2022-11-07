package com.org.model;

import com.org.Service;
import com.org.model.animals.Animals;
import com.org.model.enums.AnimalType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class LocationDAO {
    ModelDAO modelDAO = new ModelDAO();
    public List<HashMap<Class<?>, List<? extends Animals>>> generateIslandPopulation() {
        List<HashMap<Class<?>, List<? extends Animals>>> list = new ArrayList<>();
        HashMap<Class<?>, List<? extends Animals>> map = null;

        AnimalType[] values = AnimalType.values();
        int seedOfAnimals;
        for (AnimalType value : values) {
            List<? super Animals> animals = new ArrayList<>();
            System.out.println(value.toString() + " " + value.getMaxPopulation());
            int randomTypeOfAnimals = Service.randomTypeOfAnimals(value.getMaxPopulation());
            System.out.println(randomTypeOfAnimals);
            for (int i = 0; i < randomTypeOfAnimals; i++) {
                animals.add(AnimalFactory.createAnimal(value));
            }
            System.out.println(animals);
        }

        list.add(map);
        return list;
    }



    public static void main(String[] args) {
        LocationDAO locationDAO = new LocationDAO();
        locationDAO.generateIslandPopulation();
    }

}
