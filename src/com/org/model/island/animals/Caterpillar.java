package com.org.model.island.animals;

import com.org.model.interfaces.Eatable;
import com.org.model.interfaces.Herbivores;
import com.org.model.island.vegetable.Vegatable;


import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Caterpillar extends Animal implements Herbivores {
    private static double weight = 0.1;
//    private static int maxPopulation=1000;
//    private static int speedByCell = 0;
    private static double foodRequired = 0.01;


    private String name;
    private Boolean gender; //TRue if Male , False if Femene
    private static int quantityOfCaterpillar;
    private static int quantityOfMale;
    private static int quantityOfFemale;


    public Caterpillar() {
    }

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

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Caterpillar.weight = weight;
    }

    public static double getFoodRequired() {
        return foodRequired;
    }

    public static void setFoodRequired(double foodRequired) {
        Caterpillar.foodRequired = foodRequired;
    }

    public static int getQuantityOfMale() {
        return quantityOfMale;
    }

    public static void setQuantityOfMale(int quantityOfMale) {
        Caterpillar.quantityOfMale = quantityOfMale;
    }

    public static int getQuantityOfFemale() {
        return quantityOfFemale;
    }

    public static void setQuantityOfFemale(int quantityOfFemale) {
        Caterpillar.quantityOfFemale = quantityOfFemale;
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public Double eatVeggie(Vegatable vegatable) {
        if (vegatable.getInitialWeight() >= this.getWeight()) {
            setWeight(getWeight() + getFoodRequired());
            vegatable.setInitialWeight(vegatable.getInitialWeight() - getWeight());
        }
        return this.getWeight();
    }

    public static void main(String[] args) {
        Caterpillar caterpillar = new Caterpillar();
        System.out.println("Caterpillar  "+Caterpillar.getWeight());
        Vegatable vegatable = new Vegatable();
        System.out.println("veggie "+vegatable.getInitialWeight());
        for (int i = 0; i < 10; i++) {
            caterpillar.eatVeggie(vegatable);
        }
        System.out.println("veggie "+vegatable.getInitialWeight());
        System.out.println("Caterpillar  "+Caterpillar.getWeight());
    }
}
