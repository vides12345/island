package com.org.controller;

public class Controller {


    public void run() {
        createIsland();
        createAnimals();
        lifeCicle();
        moveToNextLocation();
    }




    private void createIsland() {
        new AnimalGenerator().generateIslandPopulation();
    }
//    public void generateLocation() {
//        //crear matriz para generar animales y plantas
//        //utilizar random para crear cantidad y genero de animales de cada tipo
//        //en cada celda generar animales
//    }
    private void createAnimals() {

    }
    private void lifeCicle() {
        eatOneEachOther();
        reproductProcces();
    }

    private void eatOneEachOther() {

    }

    private void reproductProcces() {
    }

    private void moveToNextLocation() {

    }
}
