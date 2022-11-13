package com.org.controller;

import com.org.model.island.Location;
import com.org.model.island.animals.Animal;

import java.util.HashSet;
import java.util.List;

public class Reproduction implements Runnable {
    private List<HashSet<? extends Animal>> list = Location.getList();


    @Override
    public void run() {

    }
}
