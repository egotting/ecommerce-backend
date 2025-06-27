package com.github.egotting.BackEnd.Domain.entities.Person.Customer;

import com.github.egotting.BackEnd.Domain.entities.Address.*;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.*;
import com.github.egotting.BackEnd.Domain.entities.Orders.*;
import com.github.egotting.BackEnd.Domain.entities.Person.User.*;
import com.github.egotting.BackEnd.Domain.entities.Roles.Enum.*;

import java.time.*;
import java.util.*;

public class Customer {

    public Customer() {
    }

    public Customer(User user, String fullName, CPF cpf,
                    Phone phone, List<Address>
                            address, List<Orders> orders) {
        this.id = UUID.randomUUID();
        this.user = user;
        this.fullName = fullName;
        this.cpf = cpf;
        this.phone = phone;
        this.role = ERoles.CUSTOMER.name().toUpperCase();
        this.address = address;
        this.orders = orders;
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    private UUID id;
    private User user;
    private String fullName;
    private CPF cpf;
    private Phone phone;
    private String role;
    private List<Address> address;
    private List<Orders> orders;
    private Instant insertedAt;
    private Instant updatedAt;

    public UUID getId() {
        return UUID.randomUUID();
    }

    public User getUser() {
        return user;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public String getPhone() {
        return phone.getValue();
    }

    public String getCustomerRole() {
        return getRole();
    }

    public String getCpf() {
        return cpf.getValue();
    }

    public String getFullName() {
        return fullName;
    }

    public List<Address> getAddress() {
        return address.stream().toList();
    }

    public String getRole() {
        return ERoles.CUSTOMER.name().toUpperCase();
    }

    public Instant insertedAt() {
        return Instant.now();
    }

    public Instant updatedAt() {
        return Instant.now();
    }


}

