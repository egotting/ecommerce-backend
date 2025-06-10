package com.github.egotting.BackEnd.Domain.entities.Person.User;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Identity;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Name;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Customer;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Email;
import com.github.egotting.BackEnd.Domain.entities.Person.User.ValueObjects.Password;


public class User {

    public User() {
    }

    public User(Identity id, Name name, Email email, Password password, Customer customer) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.customer = customer;
    }

    private Identity id;
    private Name name;
    private Email email;
    private Password password;
    private Customer customer;


    public Identity getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public Password getPassword() {
        return password;
    }

    public Customer getCustomer() {
        return customer;
    }
}
