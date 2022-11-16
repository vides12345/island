package com.org.model.island;

import java.util.List;

public class Island {
    private final int rows;// = 10;
    private final int columns;// = 10;
    List<List<Location>> startLocation;
    List<List<Location>> nextLocation;

    public Island(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.startLocation = startLocation;
        this.nextLocation = nextLocation;
    }
}
