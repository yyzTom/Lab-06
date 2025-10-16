package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private final List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether the given city exists in the list
     * @param city city to add
     * @return 1 if the city exists or 0 if not
     */
    public int hasCity(City city) {
        return cities.contains(city) ? 1 : 0;
    }

    /**
     * Deletes a city from the list if it exists
     * @param city city to delete
     * @throws IllegalArgumentException if city not in  list
     */
    public void delete(City city) {
        if (cities.contains(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Returns the number of cities in the list
     * @return size of the list
     */
    public int countCities() {
        return cities.size();
    }
}
