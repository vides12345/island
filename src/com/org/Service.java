package com.org;

import com.org.model.enums.AnimalType;

import java.util.Random;

public class Service {
    public static int randomTypeOfAnimals(int seed) {
        Random random = new Random();
        return    random.nextInt(seed );
    }

    public static String getNameFromEnumType(AnimalType animalType) {
        return animalType.name().charAt(0) + animalType.name().substring(1).toLowerCase();
    }

    public static Boolean getGenderOfAnimal() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public static void main(String[] args) {
        System.out.println(getNameFromEnumType(AnimalType.CATERPILLAR));
        for (int i = 0; i < 20; i++) {
            System.out.println(randomTypeOfAnimals(AnimalType.CATERPILLAR.getMaxPopulation()));

        }
    }

}
