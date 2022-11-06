package com.org.model.animals;

//покушать, размножиться, выбрать направление передвижения

import com.org.model.enums.Gender;

public abstract class Animals<T>{
    private String name;
    private Gender gender;
    private static int quantityOfAnimals = 0;



    protected Animals() {
        quantityOfAnimals++;
    }



    public Animals(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    abstract void multiply(Animals<T> animalsF, Animals<T> animalsM);

    abstract void moveInToDirecction();



}
