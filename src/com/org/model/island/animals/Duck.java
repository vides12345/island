package com.org.model.island.animals;

import com.org.Service;
import com.org.model.interfaces.Carnivore;
import com.org.model.interfaces.Herbivores;
import com.org.model.island.vegetable.Vegatable;

import java.awt.image.ImageProducer;
import java.util.*;

public class Duck extends Animals implements Carnivore, Herbivores {
    private static Map<Class<? extends Animals>, Integer> map = new HashMap<>();
    private static double weight = 1;

    //    private static int maxPopulation=200;
    //    private static int speedByCell=4;
    //    private static double foodRequired=0.15;
    static {
        map.put(Deer.class, 90);
        map.put(Wolf.class, 90);
        map.put(Caterpillar.class, 90);
    }
    private String name;
    private Boolean gender; //TRue if Male , False if Femene
    private static int quantityOfDuck;
    private static int quantityOfMale;
    private static int quantityOfFemale;

    public Duck(String name, Boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public Duck() {
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

    public static int getQuantityOfMale() {
        return quantityOfMale;
    }

    public static void setQuantityOfMale(int quantityOfMale) {
        Duck.quantityOfMale = quantityOfMale;
    }

    public static int getQuantityOfFemale() {
        return quantityOfFemale;
    }

    public static void setQuantityOfFemale(int quantityOfFemale) {
        Duck.quantityOfFemale = quantityOfFemale;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Duck.weight = weight;
    }



    @Override
    public String toString() {
        return name + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public Double eatVeggie(Vegatable vegatable) {
        if (vegatable.getInitialWeight() >= getWeight()) {
            setWeight(getWeight() + 0.15);
            vegatable.setInitialWeight(vegatable.getInitialWeight() - 0.15);
        }
        return getWeight();
    }

/*
Carnivores eat all kind of Eatable animals
 */
    @Override
    public Class<? extends Animals> eatMeat(int posibility) {
        Set<Map.Entry<Class<? extends Animals>, Integer>> entries = map.entrySet();
        List<Class<? extends Animals>> keys = new ArrayList<>();
        for (Map.Entry<Class<? extends Animals>, Integer> entry : entries) {
            if (Objects.equals(posibility, entry.getValue())) {
                 keys.add(entry.getKey());
            }
        }
        //choice one from set
        if (keys.size() > 0) {
            //return animal
            int index = Service.randomTypeOfAnimals(keys.size());
            System.out.println("index           "+ index);
            System.out.println(keys);
            return keys.get(index);
        }
        return null;
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        for (int i = 0; i < 10; i++) {
            Class<? extends Animals> aClass = duck.eatMeat(90);
            System.out.println(aClass);
        }

    }
}
