package com.org.controller;

import com.org.model.interfaces.Carnivore;
import com.org.model.interfaces.Herbivorous;
import com.org.model.island.Location;
import com.org.model.island.animals.Animal;
import com.org.model.island.vegetable.Vegatable;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Eat {
    private static List<HashSet<? extends Animal>> list = Location.getList();
    Vegatable vegatable = new Vegatable();
    public void locationEat() {
        //we check if elements of HashSet are Carnivores or Hervibour
        //if carnivore we call animal.eat()
        //remove animal element if was hunted or  eated(Eatable marker ) from animal list Location on hashset.
        //if herbivour we call animal.herbivour.eat
        // minus total kg of vegetable that the animal eat
        // we fix total weight vegetable and total eats
        for (HashSet<? extends Animal> set : list) {
            HashSet<? extends Animal> setToUpdate = set;
            System.out.println("update " + setToUpdate);
            for (Animal animal : set) {
                if (animal instanceof Carnivore) {
                    Class eat = animal.eat(getProbability());
                    System.out.println(eat + "%%%%%%%%%%%%%%%%%%%");
                    getAndRemove(eat);
//                    //find and remove from list,  with HashSet of Class firstAny animal of this type
                } else if (animal instanceof Herbivorous) {
                    System.out.println(animal.getClass().getSimpleName() + "  Eat");
                    ((Herbivorous) animal).eatVeggie(vegatable);
                    System.out.println("Weight    " + vegatable.getWeight());

                    //minus kg vegetable
                }

            }
        }
    }

    private void getAndRemove(Class animalClass) {
        for (HashSet<? extends Animal> animalSet : list) {
            System.out.println(animalSet.size()+"       Do    "+animalSet);
            Iterator<? extends Animal> iterator = animalSet.iterator();
            while (iterator.hasNext()) {
                Animal next = iterator.next();
                if (next.getClass() == animalClass) {
                    iterator.remove();
                    break;
                }
            }
            System.out.println(animalSet.size() +"         Pislya    "+animalSet);
        }
    }

    private int getProbability() {
        int bound = 100;
        int result = ThreadLocalRandom.current().nextInt(bound);
        System.out.println("Thread " + Thread.currentThread().getId() + " generated " + result);
        int probability = 0;
        if (result > 0 && result <= 10) {
            probability = 10;
        } else if (result > 10 && result <= 20) {
            probability = 20;
        } else if (result > 20 && result <= 30) {
            probability = 30;
        } else if (result > 30 && result <= 40) {
            probability = 40;
        } else if (result > 40 && result <= 50) {
            probability = 50;
        } else if (result > 50 && result <= 60) {
            probability = 60;
        } else if (result > 60 && result <= 70) {
            probability = 70;
        } else if (result > 70 && result <= 80) {
            probability = 80;
        } else if (result > 80 && result <= 100) {
            probability = 90;
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
        Eat eat = new Eat();
        AnimalGenerator generator = new AnimalGenerator();
        generator.generateLocationPopulation();

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
        eat.locationEat();
    }


}
