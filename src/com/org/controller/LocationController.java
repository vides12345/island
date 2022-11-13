package com.org.controller;

import com.org.model.island.Location;
import com.org.model.island.animals.Animal;

import java.util.HashSet;
import java.util.List;

public class LocationController {
    private List<HashSet<? extends Animal>> list = Location.getList();

    public synchronized void Add() {

    }

    public synchronized void get() {

    }
}
