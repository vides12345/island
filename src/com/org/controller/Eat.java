package com.org.controller;

import com.org.model.island.Location;
import com.org.model.island.animals.Animal;

import java.util.HashSet;
import java.util.List;


public class Eat {
    private static List<HashSet<? extends Animal>> list = Location.getList();

    public void locationEat() {
        //from Location list, we create two sets, one Carnivores and other herbivorous
        //we check if elements of HashSet are Carnivores or Hervibour
        //if carnivore we call animal.eat()
        //remove element from list
        //if herbivour we call animal.herbivour.eat
        // minus total kg of vrgrtablr that the animal eat
        // we fix total weight vegetable and total eats
    }
}
