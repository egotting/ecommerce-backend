package com.github.egotting.BackEnd.Domain.Person.Address.CValueObjects;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

public class Street {
    private String name;
    private String number;
    private String complement;

    public Street(String name, String number, String complement) {
        if (!isValid(name, number)) throw new IllegalArgumentException();

        this.name = name;
        this.number = number;
        this.complement = complement;

    }

    private boolean isValid(String name, String number) {
        if (name == null || number == null && name.isEmpty() || number.isEmpty()) return false;
        if (!name.matches("^[A-Za-zÀ-ÿ\\s]+$") || !number.matches("^(?:[1-9][0-9]*)(?:\\.\\d+)?$")) return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", complement='" + complement + '\'' +
                '}';
    }
}

class StreetTest {
    @Test
    void testValidStreet() {
        Street street = new Street("Rua das Flores", "1", "");
        System.out.println(street);
    }
}