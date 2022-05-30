package com.example.winside;

public class Point {

    private String id;
    private double lat;
    private double lon;

    public Point(String id, double lat, double lon) throws Exception {
        this.id = id;
        setLat(lat);
        setLon(lon);
    }

    public String getId() {
        return this.id;
    }

    public double getLat() {
        return this.lat;
    }

    public double getLon() {
        return this.lon;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLat(double lat) throws Exception {
        if(latRange(lat)) {
            this.lat = lat;
        } else {
            throw new Exception("lat out of range (-90 to 90)");
        }
    }

    public void setLon(double lon) throws Exception {
        if(lonRange(lon)) {
            this.lon = lon;
        } else {
            throw new Exception("lon out of range (-180 to 180)");
        }
    }

    private boolean latRange(double lat) {
        if(-90 < lat && lat < 90) {
            return true;
        } else {
            return false;
        }
    }

    private boolean lonRange(double lon) {
        if(-180 < lat && lat < 180) {
            return true;
        } else {
            return false;
        }
    }   

    @Override
    public String toString() {
        return String.format("id: %s, lat: %.2f, lon: %.2f", this.id, this.lat, this.lon);
    }

}
