package com.github.egotting.BackEnd.Domain.CValueObjects;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.CPF;
import org.junit.jupiter.api.Test;

public class CPFTest {

    @Test
    void shouldCreateCPF() {
        CPF cpf = new CPF("214.197.213-21");
        System.out.println(cpf);
    }
}
