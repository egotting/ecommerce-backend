package com.github.egotting.BackEnd.Domain.Person.Orders.ValueObjects;

import com.github.egotting.BackEnd.Domain.entities.Orders.Enum.Status;
import com.github.egotting.BackEnd.Domain.entities.Orders.ValueObjects.StatusOrders;
import org.junit.jupiter.api.Test;

import java.util.List;

class StatusOrdersTest {

    @Test
    void shouldCreateStatusOrders() {
        StatusOrders statusOrders = new StatusOrders(Status.CANCELED);
        System.out.println(statusOrders);
    }

}