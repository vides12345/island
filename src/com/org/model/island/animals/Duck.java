package com.org.model.island.animals;

import com.org.model.interfaces.Carnivores;
import com.org.model.interfaces.Herbivores;
import com.org.model.island.vegetable.Vegatable;
import com.org.model.island.vegetable.Vegatable;

import java.util.concurrent.atomic.AtomicInteger;

public class Duck extends Animals implements Carnivores, Herbivores {
    //    private static int weight =1;
//    private static int maxPopulation=200;
//    private static int speedByCell=4;
//    private static double foodRequired=0.15;
    private String name;
    private Boolean gender; //TRue if Male , False if Femene
    private static int quantityOfDuck;

    public Duck(String name, Boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public static int getQuantityOfDuck() {
        return quantityOfDuck;
    }

    public static void setQuantityOfDuck(int quantityOfDuck) {
        Duck.quantityOfDuck = quantityOfDuck;
    }

    @Override
    public String toString() {
        return  name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
