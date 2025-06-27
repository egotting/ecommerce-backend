package com.github.egotting.BackEnd.Domain.entities.Person.User.ValueObjects;

import java.util.Objects;

public class Password {
    private String value;

    public Password(String value) {
        if (!isValid(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty value needs to be between 8 and " +
                    "32 characters long, must contain at least one digit, one lowercase letter, one uppercase letter");
        }
        this.value = value;
    }

    public boolean isValid(String value) {
        if (value.isEmpty()) return false;
        if (value.length() < 8 || value.length() > 32) return false;
        if (!value.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-={}\\[\\]:;\"'<>,.?/\\\\|]).{8,}$"))
            return false;
        return true;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Password password = (Password) o;
        return Objects.equals(value, password.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "Password{" +
                "value='" + value + '\'' +
                '}';
    }
}
