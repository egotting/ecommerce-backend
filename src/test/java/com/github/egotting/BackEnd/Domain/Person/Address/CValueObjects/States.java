package com.github.egotting.BackEnd.Domain.Person.Address.CValueObjects;

import org.junit.jupiter.api.Test;

import java.util.Objects;

public class States {
    private String states;

    public States(String states) {
        if (!isValid(states)) {
            throw new IllegalArgumentException("Invalid states: " + states);
        }
        this.states = states;
    }

    private boolean isValid(String states) {
        if (states == null || states.isEmpty()) return false;
        if (!states
                .trim()
                .toUpperCase()
                .matches(
                        "^(AC|AL|AP|AM|BA|CE|DF|ES|GO|MA|MT|MS|MG|PA|PB|PR|PE|PI|RJ|RN|RS|RO|RR|SC|SP|SE|TO)$")
        ) return false;

        return true;
    }

    public String getStates() {
        return states;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        States states1 = (States) o;
        return Objects.equals(states, states1.states);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(states);
    }

    @Override
    public String toString() {
        return "State{" +
                "states='" + states + '\'' +
                '}';
    }
}

class streetTest {
    @Test
    void testValidStates() {
        States states = new States("SP");
        System.out.println(states);
    }

    @Test
    void testInvalidStates() {
        States states = new States("XX");
        System.out.println(states);
    }
}
