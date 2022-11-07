package com.org;

import com.org.model.animals.Caterpillar;
import com.org.model.enums.AnimalType;

import java.util.Random;

public class Service {
    public static int randomTypeOfAnimals(int seed) {
        Random random = new Random();
        return 3+ random.nextInt(seed-2);
    }

    public static String getNameFromEnumType(AnimalType animalType) {
        return animalType.name().charAt(0) + animalType.name().substring(1).toLowerCase();
    }

    public static Character getGenderOfAnimal() {
        Random random = new Random();
        return random.nextBoolean()? 'M':'F';
    }



    public static void main(String[] args) {
        System.out.println(getNameFromEnumType(AnimalType.CATERPILLAR));
        for (int i = 0; i < 20; i++) {
            System.out.println(randomTypeOfAnimals(AnimalType.CATERPILLAR.getMaxPopulation()));

        }
    }

}
