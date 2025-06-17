package com.github.egotting.BackEnd.Domain.entities.Person.Customer.Objects;

import com.github.egotting.BackEnd.Domain.entities.Address.Address;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.ValueObjects.CPF;

public class InfoCustomer {
    public InfoCustomer(String fullName, CPF cpf, Address address) {
        this.fullName = fullName;
        this.cpf = cpf;
        this.address = address;
    }

    private String fullName;
    private CPF cpf;
    private Address address;

    public String getCpf() {
        return cpf.getValue();
    }

    public String getFullName() {
        return fullName;
    }

    public Address getAddress() {
        return address.getAddress().build();
    }
}
