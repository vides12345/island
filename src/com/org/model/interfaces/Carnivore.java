package com.org.model.interfaces;

import com.org.model.island.animals.Animal;

public interface Carnivore {
      Class<? extends Animal> eatMeat(int posibility);
}
