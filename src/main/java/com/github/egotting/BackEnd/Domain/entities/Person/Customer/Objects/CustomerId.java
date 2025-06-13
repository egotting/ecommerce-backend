package com.github.egotting.BackEnd.Domain.entities.Person.Customer.Objects;

import com.github.egotting.BackEnd.Domain.entities.Person.User.User;

import java.util.UUID;

public class CustomerId {
    private UUID id;
    private User user;

    public CustomerId(User user) {
        this.id = UUID.randomUUID();
        this.user = user;
    }
}
