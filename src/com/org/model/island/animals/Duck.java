package com.org.model.island.animals;

import com.org.Service;
import com.org.model.enums.AnimalType;
import com.org.model.interfaces.Carnivore;
import com.org.model.interfaces.Eatable;
import com.org.model.interfaces.herbivorous;
import com.org.model.island.AnimalFactory;
import com.org.model.island.vegetable.Vegatable;

import java.util.*;

public class Duck extends Animal implements Carnivore, herbivorous, Eatable {

    private static Map<Class<? extends Animal>, Integer> map = new HashMap<>();
    private static float duckWeight = 1;

    //    private static int maxPopulation=200;
    //    private static int speedByCell=4;
    private static float duckFoodRequired =1;// 0.15;

    static {
//        map.put(Deer.class, 90);
//        map.put(Wolf.class, 90);
        map.put(Caterpillar.class, 90);
    }
    private static int quantityOfDuck;
    private static int quantityOfMale;
    private static int quantityOfFemale;

    public Duck() {
    }

    public Duck(String name, Boolean gender) {
        super(name, gender);
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

    public static float getDuckWeight() {
        return duckWeight;
    }

    public static void setDuckWeight(float duckWeight) {
        Duck.duckWeight = duckWeight;
    }

    public static float getDuckFoodRequired() {
        return duckFoodRequired;
    }

    public static void setDuckFoodRequired(float duckFoodRequired) {
        Duck.duckFoodRequired = duckFoodRequired;
    }

    @Override
    public Float eatVeggie(Vegatable vegatable) {
        if (vegatable.getInitialWeight() >= getDuckWeight()) {
            setDuckWeight(getDuckWeight() + getDuckFoodRequired());
            vegatable.setInitialWeight(vegatable.getInitialWeight() - getDuckFoodRequired());
        }
        return getDuckWeight();
    }

    /*
    Carnivores eat all kind of Eatable animals, if there are more one
    eatable animal, randomly choice one
     */
    @Override
    public Class<? extends Animal> eat(int probability) {
        Set<Map.Entry<Class<? extends Animal>, Integer>> entries = map.entrySet();
        List<Class<? extends Animal>> keys = new ArrayList<>();
        for (Map.Entry<Class<? extends Animal>, Integer> entry : entries) {
            if (Objects.equals(probability, entry.getValue())) {
                keys.add(entry.getKey());
            }
        }
        //choice one from set
        Class<? extends Animal> aClass=null;// = keys.get(index);
        if (keys.size() > 1) {
            //return animal fro static HashMap
            int index = Service.randomTypeOfAnimals(keys.size());
            aClass = keys.get(index);
        } else {
            aClass = keys.get(0);
        }
        return aClass;

    }

    @Override
    public Animal<? extends Animal> multiply(Animal animal) {
        if (animal instanceof Duck) {
            Duck duck = (Duck) animal;
            if (!duck.getGender().equals(this.getGender())) {
                Duck duckNew = (Duck) AnimalFactory.createAnimal(AnimalType.DUCK);
                return duckNew;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        for (int i = 0; i < 2; i++) {
            Class<? extends Animal> aClass = duck.eat(90);
            System.out.println(aClass.getSimpleName());
        }
        Duck duckNew = new Duck();
        System.out.println("Duck  " + Duck.getDuckWeight());
        Vegatable vegatable = new Vegatable();
        System.out.println("veggie " + vegatable.getInitialWeight());
        for (int i = 0; i < 2; i++) {
            duckNew.eatVeggie(vegatable);
        }
        System.out.println("veggie " + vegatable.getInitialWeight());
        System.out.println("Duck  " + Duck.getDuckWeight());


    }

}
