package com.github.egotting.BackEnd.Domain.Person.Address;

import com.github.egotting.BackEnd.Domain.entities.Address.Address;
import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.City;
import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.States;
import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.Street;
import com.github.egotting.BackEnd.Domain.entities.Address.ValueObjects.ZipCode;
import org.junit.jupiter.api.Test;

public class TestAddress {
    @Test
    void testAddressBuilder() {
        Address address = new Address.AddressBuilder()
                .street(new Street("rua das flores", "123", ""))
                .city(new City("Terezina"))
                .state(new States("PI"))
                .zipCode(new ZipCode("27913-360"))
                .build();
        System.out.println(address);
    }
}
