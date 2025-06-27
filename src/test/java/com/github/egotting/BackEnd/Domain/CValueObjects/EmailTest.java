package com.github.egotting.BackEnd.Domain.CValueObjects;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Email;
import org.junit.jupiter.api.Test;

public class EmailTest {
    @Test
    void shouldCreateEmail() {
        Email createEmail = new Email("user@example.com");
        System.out.println(createEmail);
    }
}
