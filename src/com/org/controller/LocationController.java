package com.org.controller;

import com.org.model.island.Location;
import com.org.model.island.animals.Animal;
import com.org.model.island.animals.Duck;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class LocationController {
    private List<HashSet<? extends Animal>> list = Location.getList();
    Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void AddAnimal(Animal<? extends Animal> animal) {
//        Location.getList().add(animal);
        for (HashSet<? extends Animal> animalSet : list) {
            System.out.println(animalSet.size());
            System.out.println(" do    " + animalSet);
            HashSet<? super Animal> copy = (HashSet<? super Animal>) animalSet;
            Iterator<? extends Animal> iterator = animalSet.iterator();
            while (iterator.hasNext()) {
                Animal next = iterator.next();
                if (next.getClass() == animal.getClass()) {
                    copy.add(animal);
                    break;
                }
            }
            animalSet = (HashSet<? extends Animal>) copy;
            System.out.println(animalSet.size());
            System.out.println(" posle    " + animalSet);
        }
    }

    public void removeAnimal(Animal animal) {
        for (HashSet<? extends Animal> animalSet : list) {
            System.out.println(animalSet.size() + "       Do    " + animalSet);
            Iterator<? extends Animal> iterator = animalSet.iterator();
            while (iterator.hasNext()) {
                Animal next = iterator.next();
                if (next.getClass() == animal.getClass()) {
                    iterator.remove();
                    break;
                }
            }
            System.out.println(animalSet.size() + "         Pislya    " + animalSet);
        }

    }

    public static void main(String[] args) {
        AnimalGenerator animalGenerator = new AnimalGenerator();
        animalGenerator.generateLocationPopulation();

        LocationController locationController = new LocationController();
        Duck duck = new Duck();
        locationController.AddAnimal(duck);
        Duck duck1 = new Duck();
        locationController.AddAnimal(duck1);
        Duck duck2 = new Duck();
        locationController.AddAnimal(duck2);
        locationController.removeAnimal(duck);

    }
}
