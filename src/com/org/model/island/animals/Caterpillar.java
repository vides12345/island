package com.org.model.island.animals;

import com.org.model.enums.AnimalType;
import com.org.model.interfaces.herbivorous;
import com.org.model.island.AnimalFactory;
import com.org.model.island.vegetable.Vegatable;

public class Caterpillar extends Animal implements herbivorous {
    private static Float weight = 0.1F;
    //    private static int maxPopulation=1000;
//    private static int speedByCell = 0;
    private static float foodRequired = 0.01F;

    private static int quantityOfCaterpillar;
    private static int quantityOfMale;
    private static int quantityOfFemale;

    public Caterpillar() {
    }

    public Caterpillar(String name, Boolean gender) {
        super(name, gender);
    }


    public static int getQuantityOfCaterpillar() {
        return quantityOfCaterpillar;
    }

    public static void setQuantityOfCaterpillar(int quantityOfCaterpillar) {
        Caterpillar.quantityOfCaterpillar = quantityOfCaterpillar;
    }

    public static Float getWeight() {
        return weight;
    }

    public static void setWeight(float weight) {
        Caterpillar.weight = weight;
    }

    public static float getFoodRequired() {
        return foodRequired;
    }

    @Override
    public String toString() {
        return "Caterpilla" + super.toString();
    }

    @Override
    public Float eatVeggie(Vegatable vegatable) {
        if (vegatable.getInitialWeight() >= this.getWeight()) {
            setWeight(getWeight() + getFoodRequired());
            vegatable.setInitialWeight(vegatable.getInitialWeight() - getWeight());
        }
        return this.getWeight();
    }

    @Override
    public Animal<? extends Animal> multiply(Animal animal) {
        if (animal instanceof Caterpillar) {
            Caterpillar caterpillar = (Caterpillar) animal;
            if (!caterpillar.getGender().equals(this.getGender())) {
                Caterpillar caterpillarNew = (Caterpillar) AnimalFactory.createAnimal(AnimalType.CATERPILLAR);
                return caterpillarNew;
            }
        }
        return null;
    }

    @Override
    public Class<? extends Animal> eat(int probability) {
        return null;
    }


    public static void main(String[] args) {
        Caterpillar caterpillar = new Caterpillar();
        System.out.println("Caterpillar  " + Caterpillar.getWeight());
        Vegatable vegatable = new Vegatable();
        System.out.println("veggie " + vegatable.getInitialWeight());
        for (int i = 0; i < 10; i++) {
            caterpillar.eatVeggie(vegatable);
        }
        System.out.println("veggie " + vegatable.getInitialWeight());
        System.out.println("Caterpillar  " + Caterpillar.getWeight());

        Caterpillar caterpillar1 = new Caterpillar();
        Caterpillar caterpillar2 = new Caterpillar();
        caterpillar1.setGender(Boolean.TRUE);
        caterpillar2.setGender(Boolean.FALSE);

        System.out.println(caterpillar1.multiply(caterpillar2));
    }

}
