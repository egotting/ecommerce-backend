package com.github.egotting.BackEnd.Domain.entities.Person.Customer.Objects;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Email;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.ValueObjects.Phone;

public class ContactCustomer {
    public ContactCustomer(Email email, Phone phone) {
        this.email = email;
        this.phone = phone;
    }

    private Email email;
    private Phone phone;
}
