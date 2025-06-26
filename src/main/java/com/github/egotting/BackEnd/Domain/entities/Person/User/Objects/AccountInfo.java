package com.github.egotting.BackEnd.Domain.entities.Person.User.Objects;

import com.github.egotting.BackEnd.Domain.entities.Roles.Roles;

import java.time.Instant;

public class AccountInfo {


    public AccountInfo() {
        this.role.getNameUser();
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
        this.isActive = true;
    }

    private Roles role;
    private Instant insertedAt;
    private Instant updatedAt;
    private boolean isActive;


    public Roles getRole() {
        return role.getNameUser();
    }
}
