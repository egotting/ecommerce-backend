package com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects;

public class Street {
    private String name;
    private String number;
    private String complement;
    private StringBuilder completeAddress;

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

    public StringBuilder getValue() {
        return completeAddress.append(name)
                .append(", ")
                .append(number)
                .append(", ")
                .append(" - ")
                .append(complement);
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
