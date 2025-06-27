package com.github.egotting.BackEnd.Domain.entities.Roles;

import com.github.egotting.BackEnd.Domain.entities.Person.Admin.*;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.*;
import com.github.egotting.BackEnd.Domain.entities.Person.User.*;
import com.github.egotting.BackEnd.Domain.entities.Roles.Enum.*;

import java.time.*;
import java.util.*;

public class Roles {
    public Roles() {
    }

    public Roles(Long id, ERoles name, List<User> users, List<Customer> customers, List<Admin> admins) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.customers = customers;
        this.admins = admins;
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    private Long id;
    private ERoles name;
    private List<User> users;
    private List<Customer> customers;
    private List<Admin> admins;
    private Instant insertedAt;
    private Instant updatedAt;

    public Long getId() {
        return id;
    }

    public List<String> getRoles() {
        List<ERoles> roles = List.of(ERoles.values());

        return roles.stream()
                .map(Enum::name)
                .toList();

    }

    public Roles getNameAdmin() {
        return name == ERoles.ADMIN ? this : null;
    }

    public Roles getNameUser() {
        return name == ERoles.USER ? this : null;
    }

    public String getNameCustomer() {
        return ERoles.CUSTOMER == name ? name.name() : null;
    }

    public List<Admin> getAdmins() {
        return admins.stream().toList();
    }

    public List<Customer> getCustomers() {
        return customers.stream().toList();
    }

    public List<User> getUsers() {
        return users.stream().toList();
    }

    public Instant insertedAt() {
        return Instant.now();
    }

    public Instant updatedAt() {
        return Instant.now();
    }
}
