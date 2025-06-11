package com.github.egotting.BackEnd.Domain.entities.Address;


import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.States;
import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.Street;
import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.ZipCode;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Identity;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Customer;

public class Address {
    private Identity id;
    private Street street;
    private States state;
    private ZipCode zpc;
    private Customer user;
}
