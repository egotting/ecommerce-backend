package com.github.egotting.BackEnd.Domain.Address;


import com.github.egotting.BackEnd.Domain.Address.ValueObjects.Country;
import com.github.egotting.BackEnd.Domain.Address.ValueObjects.State;
import com.github.egotting.BackEnd.Domain.Address.ValueObjects.Street;
import com.github.egotting.BackEnd.Domain.Address.ValueObjects.ZipCode;
import com.github.egotting.BackEnd.Domain.Person.Customer.Customer;

import java.util.UUID;

public class Address {
    private UUID id;
    private Street street;
    private State state;
    private Country country;
    private ZipCode zpc;
    private Customer user;
}
