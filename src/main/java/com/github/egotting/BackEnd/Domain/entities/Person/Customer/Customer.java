package com.github.egotting.BackEnd.Domain.entities.Person.Customer;

import com.github.egotting.BackEnd.Domain.entities.Address.*;
import com.github.egotting.BackEnd.Domain.entities.Orders.Orders;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Objects.ContactCustomer;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Objects.CustomerId;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Objects.InfoCustomer;
import com.github.egotting.BackEnd.Domain.entities.Person.User.User;
import com.github.egotting.BackEnd.Domain.entities.Roles.*;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class Customer {

    public Customer(CustomerId id, InfoCustomer infoCustomer, ContactCustomer contactInfo, List<Orders> orders) {
        this.customerId = id;
        this.contactInfo = contactInfo;
        this.infoCustomer = infoCustomer;
        this.orders = orders;
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    private CustomerId customerId;
    private InfoCustomer infoCustomer;
    private ContactCustomer contactInfo;
    private List<Orders> orders;
    private Instant insertedAt;
    private Instant updatedAt;

    public UUID getId() {
        return customerId.getId();
    }

    public User getUser() {
        return customerId.getUser();
    }

    public String getFullName() {
        return infoCustomer.getFullName();
    }

    public List<Address> getAddress() {
        return infoCustomer.getAddress();
    }

    public String getCpfValue() {
        return infoCustomer.getCpf();
    }

    public String getPhoneNumber() {
        return contactInfo.getPhoneCustomer();
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public Instant getInsertedAt() {
        return insertedAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Roles getCustomerRole() {
        return infoCustomer.getRole();
    }

    public Instant insertedAt() {
        return Instant.now();
    }

    public Instant updatedAt() {
        return Instant.now();
    }


}

