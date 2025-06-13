package com.github.egotting.BackEnd.Domain.entities.Payment.Objects;

import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Customer;

import java.util.UUID;

public class IdentifyPayment {
    public IdentifyPayment(Customer cpf_payed) {
        this.id = UUID.randomUUID();
        this.cpf_payed = cpf_payed;
    }

    private UUID id;
    private Customer cpf_payed;

    public String getCpf(){
        return cpf_payed.getCpfValue();
    }
}
