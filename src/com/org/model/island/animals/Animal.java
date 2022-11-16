package com.org.model.island.animals;

//покушать, размножиться, выбрать направление передвижения

public abstract class Animal<T>{
    protected String name;
    protected Boolean gender; //TRue if Male , False if Femene

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

    @Override
    public String toString() {
        return '{' +"name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
//Realized completly for Caterpillar and Duck
    public abstract Animal<? extends Animal> multiply(Animal animal);
    public abstract Class<? extends Animal> eat(int probability);
//    public abstract void moveInToDirecction();


}
