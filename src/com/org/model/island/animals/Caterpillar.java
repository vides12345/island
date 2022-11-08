package com.org.model.island.animals;

import com.org.model.interfaces.Herbivores;
import com.org.model.island.vegetable.Vegatable;


import java.util.concurrent.atomic.AtomicInteger;

public class Caterpillar extends Animals implements Herbivores {
//    private static double weight = 0.01;
//    private static int maxPopulation=1000;
//    private static int speedByCell = 0;
//    private static double foodRequired = 0;

    private String name;
    private Boolean gender; //TRue if Male , False if Femene
    private static int quantityOfCaterpillar;

    public Caterpillar(String name, Boolean gender) {
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

    public static int getQuantityOfCaterpillar() {
        return quantityOfCaterpillar;
    }

    public static void setQuantityOfCaterpillar(int quantityOfCaterpillar) {
        Caterpillar.quantityOfCaterpillar = quantityOfCaterpillar;
    }



    @Override
    public String toString() {
        return  name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
