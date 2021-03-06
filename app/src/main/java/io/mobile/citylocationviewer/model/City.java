package io.mobile.citylocationviewer.model;

import com.google.gson.annotations.SerializedName;

public class City {

    @SerializedName("_id") private final int id;
    @SerializedName("name") private final String name;
    @SerializedName("country") private final String country;
    @SerializedName("coord") private final Coordinate coordinate;

    public City(int id, String name, String country, Coordinate coordinate) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.coordinate = coordinate;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public City copy() {
        return new City(id, name, country, coordinate);
    }
}
