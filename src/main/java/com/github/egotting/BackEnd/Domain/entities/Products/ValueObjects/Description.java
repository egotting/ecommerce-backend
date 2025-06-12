package com.github.egotting.BackEnd.Domain.entities.Products.ValueObjects;

import java.util.Objects;

public class Description {
    private String description;

    public Description(String description) {
        if (!isValid(description)) throw new IllegalArgumentException("Description cannot be empty or null");
        this.description = description;
    }

    private boolean isValid(String description) {
        if (description.isEmpty() || description == null) return false;
        if (!description.matches("^[A-Za-zÀ-ÿ\\s]+$")) return false;
        return true;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "Description{" +
                "description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Description that = (Description) o;
        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(description);
    }
}
