package com.github.egotting.BackEnd.Domain.entities.Person.Customer.ValueObjects;

import java.util.Objects;

public class CPF {
    private String value;

    public CPF(String value) {
        if (!isValid(value)) {
            throw new IllegalArgumentException("CPF INVALIDO");
        }
        this.value = NumberFormat(value);
    }

    public Boolean isValid(String value) {
        String cpf = value.replaceAll("[^0-9]", "");
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            throw new IllegalArgumentException("CPF INVALIDO");
        }

        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < 9; i++) {
            int num = Character.getNumericValue(cpf.charAt(i));
            sum1 += num * (10 - i);
            sum2 += num * (11 - i);
        }

        int check1 = 11 - (sum1 % 11);
        if (check1 >= 10) check1 = 0;

        sum2 += check1 * 2;

        int check2 = 11 - (sum2 % 11);
        if (check2 >= 10) check2 = 0;

        return true;

    }

    public String NumberFormat(String value) {
        return value.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }


    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CPF cpf = (CPF) o;
        return Objects.equals(value, cpf.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "CPF{" +
                "value='" + value + '\'' +
                '}';
    }
}
