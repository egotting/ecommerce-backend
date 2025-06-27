package com.github.egotting.BackEnd.Domain.entities.Person.Admin.ValueObjects;

public class Key {
    private String value;

    public Key(String value) {
        this.value = value;
    }

    private boolean isValid(String value) {
        if (value == null || value.isEmpty()) return false;

        if (value.length() < 8) return false;
        return true;
    }

    public String generateKey() {
        // TODO: Implement key generation logic
        return "";
    }

    public String getValue() {
        return value;
    }
}
