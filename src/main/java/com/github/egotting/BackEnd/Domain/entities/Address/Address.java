package com.github.egotting.BackEnd.Domain.entities.Address;


import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.City;
import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.States;
import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.Street;
import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.ZipCode;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Customer;

import java.time.*;


public class Address {

    public Address() {
    }

    public Address(Long id, Street street, City city, States state, ZipCode zpc, Customer user) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zpc = zpc;
        this.user = user;
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    private Long id;
    private Street street;
    private City city;
    private States state;
    private ZipCode zpc;
    private Customer user;
    private Instant insertedAt;
    private Instant updatedAt;

    public Long getId() {
        return id;
    }

    public String getStreet() {
        return street.toString();
    }

    public String getCity() {
        return city.toString();
    }

    public String getState() {
        return state.toString();
    }

    public String getZpc() {
        return zpc.toString();
    }

    public Customer getUser() {
        return user;
    }

    public Instant insertedAt() {
        return Instant.now();
    }

    public Instant updatedAt() {
        return Instant.now();
    }

    @Override
    public String toString() {
        return "AddressBuilder{" +
                "street=" + street +
                ", city=" + city +
                ", state=" + state +
                ", zpc=" + zpc +
                '}';
    }
}
