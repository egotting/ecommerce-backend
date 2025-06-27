package com.github.egotting.BackEnd.Domain.entities.CValueObjects;

public class Quantity {
    private int value;

    public Quantity(int value) {
        if (!isValid(value)) throw new IllegalArgumentException("Quantity must be greater than 0");
        this.value = value;
    }

    private boolean isValid(int value) {
        if (value < Integer.MIN_VALUE || value > Integer.MAX_VALUE) return false;
        return true;
    }

    public int getValue() {
        return value;
    }
}
