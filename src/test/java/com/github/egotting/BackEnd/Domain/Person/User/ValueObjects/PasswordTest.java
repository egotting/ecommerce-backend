package com.github.egotting.BackEnd.Domain.Person.User.ValueObjects;

import org.junit.jupiter.api.Test;

public class PasswordTest {

    @Test
    void shoudlCreatePassword() {
        Password password = new Password("RongasWord123!");
        System.out.println(password);
    }
}
