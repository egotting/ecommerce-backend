package com.github.egotting.BackEnd.Domain.entities.Person.Admin.ValueObjects;

import java.util.*;

public class Key {
    private String value;

    public Key() {
        this.value = generateKey();
    }

    public String generateKey() {
        UUID key = UUID.randomUUID();
        return key.toString().replace("-", "");
    }

    public String getValue() {
        return value;
    }
}
