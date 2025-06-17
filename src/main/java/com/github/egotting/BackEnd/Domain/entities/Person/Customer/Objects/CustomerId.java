package com.github.egotting.BackEnd.Domain.entities.Person.Customer.Objects;

import com.github.egotting.BackEnd.Domain.entities.Person.User.User;

import java.util.UUID;

public class CustomerId {
    public CustomerId(User user) {
        this.id = UUID.randomUUID();
        this.user = user;
    }

    private UUID id;
    private User user;

    public UUID getId() {
        return id;
    }

    public User getUser() {
        return user;
    }
}
