package com.github.egotting.BackEnd.Domain.entities.Person.Customer.Objects;

import com.github.egotting.BackEnd.Domain.entities.Person.Customer.ValueObjects.Phone;
import com.github.egotting.BackEnd.Domain.entities.Person.User.User;

public class ContactCustomer {
    public ContactCustomer(User email, Phone phone) {
        this.email = email.getEmail();
        this.phone = phone;
    }

    private String email;
    private Phone phone;

    public String getEmailCustomer() {
        return email;
    }
    public String getPhoneCustomer() {
        return phone.getValue();
    }
}
