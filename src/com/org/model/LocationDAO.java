package com.org.model;

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
            for (int i = 0; i < randomTypeOfAnimals(value.getMaxPopulation()); i++) {
                System.out.println(AnimalFactory.createAnimal(value));
            }


        }

        list.add(map);
        return list;
    }

    public int randomTypeOfAnimals(int seed) {
        Random random = new Random();
        return 3+ random.nextInt(seed-2);

    }

    public static void main(String[] args) {
        LocationDAO locationDAO = new LocationDAO();
        locationDAO.generateIslandPopulation();
    }

}
