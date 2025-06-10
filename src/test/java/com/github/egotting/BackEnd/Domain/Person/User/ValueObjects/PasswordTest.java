package com.github.egotting.BackEnd.Domain.Person.User.ValueObjects;

import com.github.egotting.BackEnd.Domain.entities.Person.User.ValueObjects.Password;
import org.junit.jupiter.api.Test;

public class PasswordTest {

    @Test
    void shoudlCreatePassword() {
        Password password = new Password("RongasWord123!");
        System.out.println(password);
    }
}
