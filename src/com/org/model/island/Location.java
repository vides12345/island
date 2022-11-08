package com.org.model.island;



import com.org.model.island.animals.Animals;
import com.org.model.island.vegetable.Vegatable;

import java.util.List;

public class Location {
    private List<? extends Animals> animals;
    private Vegatable vegatable;

    public Location(List<? extends Animals> animals, Vegatable vegatable) {
        this.animals = animals;
        this.vegatable = vegatable;
    }

    public List<? extends Animals> getAnimals() {
        return animals;
    }

    public void setAnimals(List<? extends Animals> animals) {
        this.animals = animals;
    }


}
