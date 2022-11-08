package com.org.model.island;

import com.org.Service;
import com.org.model.enums.AnimalType;
import com.org.model.island.animals.Animals;
import com.org.model.island.animals.Caterpillar;
import com.org.model.island.animals.Duck;

public class AnimalFactory {
    public static Animals createAnimal(AnimalType type) {
        Animals<? extends Animals> animal = null;
        String name;

        switch (type) {
//            case WOLF:
//                animal = new Wolf();
//                break;
//            case DEER:
//                animal = new Deer();
//                break;
            case DUCK:
                Duck.setQuantityOfDuck(Duck.getQuantityOfDuck() + 1);
                name = Service.getNameFromEnumType(type) + (Duck.getQuantityOfDuck());
                animal = new Duck(name, Service.getGenderOfAnimal());
                break;

            case CATERPILLAR:
                Caterpillar.setQuantityOfCaterpillar(Caterpillar.getQuantityOfCaterpillar() + 1);
                name = Service.getNameFromEnumType(type) + (Caterpillar.getQuantityOfCaterpillar());
                animal = new Caterpillar(name, Service.getGenderOfAnimal());
                break;
        }
        return animal;
    }
}
