package com.github.egotting.BackEnd.Domain.entities.Person.Customer;

import com.github.egotting.BackEnd.Domain.entities.Orders.Orders;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Objects.ContactCustomer;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Objects.CustomerId;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Objects.InfoCustomer;

import java.util.List;

public class Customer {

    public Customer(CustomerId id, InfoCustomer infoCustomer, ContactCustomer contactInfo, List<Orders> orders) {
        this.customerId = id;
        this.contactInfo = contactInfo;
        this.infoCustomer = infoCustomer;
        this.orders = orders;
    }

    private CustomerId customerId;
    private InfoCustomer infoCustomer;
    private ContactCustomer contactInfo;
    private List<Orders> orders;

    public String getCpfValue(){
        return infoCustomer.getCpf();
    }
}

