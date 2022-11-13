package com.org.model.island.vegetable;

public abstract class Vegatable  {
    private double initialWeight=200;

    public double getInitialWeight() {
        return initialWeight;
    }

    public void setInitialWeight(double initialWeight) {
        this.initialWeight = initialWeight;
    }

    abstract void grow();
}
