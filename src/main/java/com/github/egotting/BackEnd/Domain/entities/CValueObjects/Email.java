package com.github.egotting.BackEnd.Domain.entities.CValueObjects;

import java.util.Objects;

public class Email {
    private String value;

    public Email(String value) {
        if (value.isEmpty() || isValid(value)) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.value = value;
    }

    public boolean isValid(String value) {
        String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return value.isEmpty() || !value.matches(EMAIL_REGEX);
    }


    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(value, email.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "Email{" +
                "value='" + value + '\'' +
                '}';
    }
}
