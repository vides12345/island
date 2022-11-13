package com.org.model.interfaces;

import com.org.model.island.animals.Animals;

public interface Carnivore {
      Class<? extends Animals> eatMeat(int posibility);
}
