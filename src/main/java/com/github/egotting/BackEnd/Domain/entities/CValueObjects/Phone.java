package com.github.egotting.BackEnd.Domain.entities.CValueObjects;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    private String value;

    public Phone(String value) {
        if (!isValid(value)) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.value = value;
    }

    public boolean isValid(String numero) {
        String CELULAR_REGEX = "^\\(?[1-9]{2}\\)?\\s?9\\d{4}-?\\d{4}$";
        Pattern pattern = Pattern.compile(CELULAR_REGEX);
        Matcher matcher = pattern.matcher(numero);
        return matcher.matches();
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(value, phone.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "value='" + value + '\'' +
                '}';
    }
}
