package com.github.egotting.BackEnd.Domain.entities.Person.Customer;

import com.github.egotting.BackEnd.Domain.entities.Address.Address;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.CPF;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Identity;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Name;
import com.github.egotting.BackEnd.Domain.entities.Orders.Orders;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.ValueObjects.Phone;
import com.github.egotting.BackEnd.Domain.entities.Person.User.User;

public class Customer {
    private Identity id;
    private User user;
    private Name fullName;
    private CPF cpf;
    private Phone phone;
    private Address address;
    private Orders orders;
}

