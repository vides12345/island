package com.org.model.island;

import com.org.model.island.animals.Animal;
import com.org.model.island.vegetable.Vegatable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Location {
    /*
    Choised data structure for each Location :HashSet. for each Animals type, cause all element is unique, and not neccesary to get
    them by index
     */
    private static List<HashSet<? extends Animal>> list= new ArrayList<>() ;
    private Vegatable vegatable;



    public static   List<HashSet<? extends Animal>> getList() {
        return list;
    }

    public static   void setList(List<HashSet<? extends Animal>> list) {
        Location.list = list;
    }

    public Vegatable getVegatable() {
        return vegatable;
    }

    public void setVegatable(Vegatable vegatable) {
        this.vegatable = vegatable;
    }
}
