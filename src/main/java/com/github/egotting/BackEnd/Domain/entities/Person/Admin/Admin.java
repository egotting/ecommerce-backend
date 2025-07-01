package com.github.egotting.BackEnd.Domain.entities.Person.Admin;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.*;
import com.github.egotting.BackEnd.Domain.entities.Person.Admin.ValueObjects.*;
import com.github.egotting.BackEnd.Domain.entities.Person.User.ValueObjects.*;
import com.github.egotting.BackEnd.Domain.entities.Roles.Enum.*;

import java.time.*;
import java.util.*;

public class Admin {
    public Admin(
            CPF cpf, String fullname, Password password,
            Phone phoneNumber, Key key) {
        this.id = UUID.randomUUID();
        this.cpf = cpf;
        this.fullname = fullname;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.key = key;
        this.role = ERoles.ADMIN.name().toUpperCase();
    }

    private UUID id;
    private CPF cpf;
    private String fullname;
    private Password password;
    private Phone phoneNumber;
    private Key key;
    private String role;

    public UUID getId() {
        return UUID.randomUUID();
    }

    public String getCpf() {
        return cpf.getValue();
    }

    public String getFullname() {
        return fullname;
    }

    public String getPassword() {
        return password.getValue();
    }

    public String getPhoneNumber() {
        return phoneNumber.getValue();
    }

    public String getKey() {
        return key.getValue();
    }

    public String getRole() {
        return ERoles.ADMIN.name().toUpperCase();
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
