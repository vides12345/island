package com.org.controller;

import com.org.model.island.Location;
import com.org.model.island.animals.Animal;

import java.util.HashSet;
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

    public synchronized void AddAnimal(Animal animal) {
//        Location.getList().add(anima);
    }

    public synchronized void removeAnimal(Animal animal) {

        Location.getList().remove(animal);
    }
}
