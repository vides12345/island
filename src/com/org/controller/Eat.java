package com.org.controller;

import com.org.model.interfaces.Carnivore;
import com.org.model.interfaces.Herbivorous;
import com.org.model.island.Location;
import com.org.model.island.animals.Animal;
import com.org.model.island.vegetable.Vegatable;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Eat {
    private static List<HashSet<? extends Animal>> list = Location.getList();
    Vegatable vegatable;

    public void locationEat() {
        //we check if elements of HashSet are Carnivores or Hervibour
        //if carnivore we call animal.eat()
        //remove animal element if was hunted or  eated(Eatable marker ) from animal list Location.
        //if herbivour we call animal.herbivour.eat
        // minus total kg of vegetable that the animal eat
        // we fix total weight vegetable and total eats
        for (HashSet<? extends Animal> set : list) {
            for (Animal animal : set) {
                if (animal instanceof Carnivore) {
                    animal.eat(getProbability());
                    //remove from list
                } else if (animal instanceof Herbivorous) {
                    ((Herbivorous) animal).eatVeggie(vegatable);
                    //minus kg vegetable
                }
            }
        }
    }

    private int getProbability() {
        int bound = 100;
        int result = ThreadLocalRandom.current().nextInt(bound);
        System.out.println("Thread " + Thread.currentThread().getId() + " generated " + result);
        int probability =0;
        if (result > 0 && result <= 10) {
            probability= 10;
        } else if (result>10 && result <=20) {
            probability= 20;
        } else if (result>20 && result <=30) {
            probability= 30;
        } else if (result>30 && result <=40) {
            probability=  40;
        } else if (result>40 && result <=50) {
            probability=  50;
        } else if (result>50 && result <=60) {
            probability=  60;
        } else if (result>60 && result <=70) {
            probability=  70;
        } else if (result> 70 && result <=80) {
            probability=  80;
        } else if (result>80 && result <=90) {
            probability=  90;
        }
        return probability;
    }

    private boolean isHerbivour(HashSet<? extends Animal> animal) {
        return animal instanceof Herbivorous;
    }

    private boolean isCarivore(HashSet<? extends Animal> animal) {
        return animal instanceof Carnivore;
    }

    public static void main(String[] args) {
        AnimalGenerator generator = new AnimalGenerator();
        generator.generateIslandPopulation();

        List<HashSet<? extends Animal>> list1 = Eat.list;
        for (HashSet<? extends Animal> hashSet : list1) {
            for (Animal animal : hashSet) {
                if (animal instanceof Carnivore) {
                    System.out.println("true");
                } else {
                    System.out.println("false");

                }
            }
        }
    }
}
