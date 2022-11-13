package com.org.model.island.animals;

//покушать, размножиться, выбрать направление передвижения

import com.org.model.enums.Gender;

public abstract class Animal<T>{
    private String name;
    private Boolean gender; //TRue if Male , False if Femene

    public Animal() {
    }

    public Animal(String name, Boolean gender) {
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

    //    private static int quantityOfAnimals = 0;
//
//
//
//    protected Animals() {
//        quantityOfAnimals++;
//    }
//
//
//
//
    public abstract  Animal<? extends Animal> multiply(Animal animal);
//
//    abstract void moveInToDirecction();


}
