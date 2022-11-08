package com.org.model.island;

public class Island {
    private static final int rows = 10;
    private static final int columns = 10;
    Location[][] locations;

    public Island( ) {
        this.locations = new Location[rows][columns];
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
}
