package com.org.model;

import com.org.model.animals.Animals;
import com.org.model.vegetable.Vegatable;

import java.util.List;

public class Location {
    private List<? extends Animals> animals;
    private Vegatable vegatable;

    public void setAnimals(List<? extends Animals> animals) {
        this.animals = animals;
    }

    public void setVegatable(Vegatable vegatable) {
        this.vegatable = vegatable;
    }
}
