package com.github.egotting.BackEnd.Domain.Keys;

import com.github.egotting.BackEnd.Domain.entities.Person.Admin.ValueObjects.*;
import org.junit.jupiter.api.*;

public class TestKeys {

    @Test
    void generateKeyTest() {
        Key keys = new Key();
        String generatedKey = keys.getValue();
        System.out.println(generatedKey);
    }

}
