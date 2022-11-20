package com.org.model.island;

import java.util.ArrayList;
import java.util.List;

public class Island {
    private final int rows;// = 10;
    private final int columns;// = 10;
    List<List<Location>> field;
    List<List<Location>> nextLocation;

    public Island(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        field = new ArrayList<>(rows);
        for (int i = 0; i < rows; i++) {
            field.add(new ArrayList<>(columns));
        }
    }
}
