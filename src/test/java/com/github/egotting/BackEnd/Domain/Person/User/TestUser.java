package com.github.egotting.BackEnd.Domain.Person.User;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Email;
import com.github.egotting.BackEnd.Domain.entities.Person.User.User;
import com.github.egotting.BackEnd.Domain.entities.Person.User.ValueObjects.Password;
import org.junit.jupiter.api.Test;

public class TestUser {
    @Test
    void testUserCreation() {
        User user = new User(
                "john",
                new Password("B@ada22363"),
                new Email("johndow@gmail.com"));
        System.out.println(user);
    }
}
