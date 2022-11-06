package com.org.model.animals;

//покушать, размножиться, выбрать направление передвижения

import com.org.model.enums.Gender;

public abstract class Animals<T>{
    private String name;
    private Gender gender;
    public Animals() {}

    abstract void multiply(Animals<T> animalsF, Animals<T> animalsM);

    abstract void moveInToDirecction();
}
