package com.github.egotting.BackEnd.Domain.entities.Person.Customer;

import com.github.egotting.BackEnd.Domain.entities.Address.Address;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.CPF;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Identity;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Name;
import com.github.egotting.BackEnd.Domain.entities.Orders.Orders;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.ValueObjects.Phone;
import com.github.egotting.BackEnd.Domain.entities.Person.User.User;

import java.awt.*;
import java.util.List;

public class Customer {
    public Customer() {
    }

    public Customer(Identity id, User user, Name fullName, CPF cpf, Phone phone, Address address, List<Orders> orders) {
        this.id = id;
        this.user = user;
        this.fullName = fullName;
        this.cpf = cpf;
        this.phone = phone;
        this.address = address;
        this.orders = orders;
    }

    private Identity id;
    private User user;
    private Name fullName;
    private CPF cpf;
    private Phone phone;
    private Address address;
    private List<Orders> orders;

    public Identity getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Name getFullName() {
        return fullName;
    }

    public CPF getCpf() {
        return cpf;
    }

    public Phone getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    public List<Orders> getOrders() {
        return orders;
    }
}

