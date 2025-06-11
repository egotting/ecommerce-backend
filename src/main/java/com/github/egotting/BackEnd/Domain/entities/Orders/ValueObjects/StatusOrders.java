package com.github.egotting.BackEnd.Domain.entities.Orders.ValueObjects;


import com.github.egotting.BackEnd.Domain.entities.Orders.Enum.Status;

public class StatusOrders {
    private Status status;

    public StatusOrders(Status status) {
        this.status = Status.valueOf(status.toString());
    }

    @Override
    public String toString() {
        return "StatusOrders{" +
                "status=" + status +
                '}';
    }
}
