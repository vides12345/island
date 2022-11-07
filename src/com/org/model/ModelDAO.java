package com.org.model;

import com.org.model.island.animals.*;
import com.org.model.enums.AnimalType;

import java.util.ArrayList;
import java.util.List;

public class ModelDAO {
    List<? extends Animals> list = new ArrayList<>();

    public static void main(String[] args) {
        ModelDAO modelDAO = new ModelDAO();
    }

    void addNewAnimals() {

    }

    void readAnimals() {

    }

    void updateAnimal() {

    }

    void removeAnimals() {

    }
}
    class AnimalFactory {
    public static Animals createAnimal(AnimalType type) {
        Animals<? extends Animals> animal = null;

        switch (type) {
            case WOLF:
                animal = new Wolf();
                break;
            case DEER:
                animal = new Deer();
                break;
            case DUCK:
                animal = new Duck();
                break;

            case CATERPILLAR:
                animal = new Caterpillar();
                break;
        }
        return animal;
    }
}

