package com.github.egotting.BackEnd.Domain.CValueObjects;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Name;
import org.junit.jupiter.api.Test;

public class NameTest {

    @Test
    void shouldCreateName() {
        Name name = new Name("John", "Doe");
        System.out.println(name);
    }
}
