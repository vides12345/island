package com.org.view;

import com.org.controller.Controller;
import com.org.controller.Service;

public class Consol {


    public void print() {
        System.out.println(Service.getAnimalCounts());
        System.out.println(Service.getDeathAnimals());
    }
}
