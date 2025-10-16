package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    private final String city;
    private final String province;

    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    String getCityName() {
        return this.city;
    }

    String getProvinceName() {
        return this.province;
    }

    /**
     *
     * @param o the object to be compared.
     * @return 0,  less than 1 or >1 if two values are equal, a less than b, or a>b
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }

    /**
     * Determines if two cities are the same based on name and province
     * @param o object to compare
     * @return true if both have the same name and province, and false if not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City other = (City) o;
        return this.city.equals(other.city) &&
                this.province.equals(other.province);
    }
}