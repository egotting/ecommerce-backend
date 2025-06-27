package com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects;

import java.util.Objects;

public class City {
    private String value;

    public City(String value) {
        if (value == null || value.isEmpty() || !value.matches("^[a-zA-Z]+(?:(?:\\s+|-)[a-zA-Z]+)*$")) {
            throw new IllegalArgumentException("City name cannot be null or empty");
        }
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(value, city.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "City{" +
                "value='" + value + '\'' +
                '}';
    }
}
