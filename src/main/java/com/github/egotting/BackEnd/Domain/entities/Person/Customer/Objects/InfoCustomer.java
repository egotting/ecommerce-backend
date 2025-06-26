package com.github.egotting.BackEnd.Domain.entities.Person.Customer.Objects;

import com.github.egotting.BackEnd.Domain.entities.Address.*;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.*;
import com.github.egotting.BackEnd.Domain.entities.Roles.*;

import java.util.*;

public class InfoCustomer {
    public InfoCustomer(String fullName, CPF cpf, List<Address> address) {
        this.fullName = fullName;
        this.cpf = cpf;
        this.address = address;
        this.role.getNameCustomer();
    }

    private String fullName;
    private CPF cpf;
    private List<Address> address;
    private Roles role;

    public String getCpf() {
        return cpf.getValue();
    }

    public String getFullName() {
        return fullName;
    }

    public List<Address> getAddress() {
        return address.stream().toList();
    }

    public Roles getRole() {
        return role.getNameCustomer();
    }
}
