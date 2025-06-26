package com.github.egotting.BackEnd.Domain.entities.Person.Admin.Objects;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.CPF;

import java.util.UUID;

public class IdAdmin {
    public IdAdmin() {
    }

    public IdAdmin(CPF cpf) {
        this.id = UUID.randomUUID();
        this.cpf = cpf;
    }

    private UUID id;
    private CPF cpf;

    public UUID getId() {
        return id;
    }

    public CPF getCpf() {
        return cpf;
    }
}
