package com.org.model.island;

import com.org.model.island.animals.Animals;
import com.org.model.island.vegetable.Vegatable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Location {
    private static   List<HashSet<? extends Animals>> list= new ArrayList<>() ;
    private Vegatable vegatable;



    public static List<HashSet<? extends Animals>> getList() {
        return list;
    }

    public static void setList(List<HashSet<? extends Animals>> list) {
        Location.list = list;
    }

    public Vegatable getVegatable() {
        return vegatable;
    }

    public void setVegatable(Vegatable vegatable) {
        this.vegatable = vegatable;
    }
}
