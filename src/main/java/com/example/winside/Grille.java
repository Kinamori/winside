package com.example.winside;

import java.util.ArrayList;
import java.util.List;

public class Grille {
    private List<Point> list = new ArrayList<Point>();

    public Grille(List<Point> list) {
        this.list = list;
    }

    public Grille(String file) {
        this.list = ReadFile.createPointFromFile(file);
    }

    private void addPoint(Point p) {
        this.list.add(p);
    }

    public long nbrPointZone(double minLat, double minLon) {
        return this.list.stream()
                        .filter(x -> x.getLat() > minLat && 
                                x.getLat() < minLat+0.5 &&
                                x.getLon() > minLon &&
                                x.getLon() < minLon+0.5)
                        .count();
    }

    
    
}
