package com.github.egotting.BackEnd.Domain.Person.Orders.ValueObjects;

import com.github.egotting.BackEnd.Domain.entities.States.*;
import org.junit.jupiter.api.*;

class StatusOrdersTest {

    @Test
    void shouldCreateStatusOrders() {
        Status statusOrders = new Status();
        statusOrders.getStatus();
        System.out.println(statusOrders);
    }

}