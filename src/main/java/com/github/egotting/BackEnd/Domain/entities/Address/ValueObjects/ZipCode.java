package com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects;

import java.util.Objects;

public class ZipCode {
    private String zipCode;

    public ZipCode(String zipCode) {
        if (!isValid(zipCode)) throw new IllegalArgumentException("Invalid Zip Code");
        this.zipCode = zipCode;
    }

    private boolean isValid(String zipCode) {
        if (zipCode == null || zipCode.isEmpty()) return false;
        if (!zipCode.matches("^\\d{5}-?\\d{3}$")) return false;
        return true;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ZipCode zipCode1 = (ZipCode) o;
        return Objects.equals(zipCode, zipCode1.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(zipCode);
    }

    @Override
    public String toString() {
        return "ZipCode{" +
                "zipCode='" + zipCode + '\'' +
                '}';
    }
}
