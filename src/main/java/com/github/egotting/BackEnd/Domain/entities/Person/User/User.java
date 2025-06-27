package com.github.egotting.BackEnd.Domain.entities.Person.User;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.*;
import com.github.egotting.BackEnd.Domain.entities.Person.User.ValueObjects.*;
import com.github.egotting.BackEnd.Domain.entities.Roles.Enum.*;

import java.time.*;
import java.util.*;


public class User {

    public User() {
    }

    public User(String nickname, Password password, Email email) {
        this.id = UUID.randomUUID();
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.role = ERoles.USER.name().toUpperCase();
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
        this.isActive = true;
    }

    private UUID id;
    private String nickname;
    private Email email;
    private Password password;
    private String role;
    private Instant insertedAt;
    private Instant updatedAt;
    private boolean isActive;

    public UUID getId() {
        return UUID.randomUUID();
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email.getValue();
    }

    public String getPassword() {
        return password.getValue();
    }


    public String getRole() {
        return ERoles.USER.name().toUpperCase();
    }

    public Instant insertedAt() {
        return Instant.now();
    }

    public Instant updatedAt() {
        return Instant.now();
    }

    public boolean isActive() {
        return true;
    }


}
