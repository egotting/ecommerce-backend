package com.github.egotting.BackEnd.Domain.entities.States;

import com.github.egotting.BackEnd.Domain.entities.Orders.*;
import com.github.egotting.BackEnd.Domain.entities.States.Enum.*;

import java.time.*;
import java.util.*;

public class Status {

    public Status() {
    }

    public Status(Long id, EStatus status, List<Orders> orders) {
        this.id = id;
        this.status = status;
        this.orders = orders;
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    private Long id;
    private EStatus status;
    private List<Orders> orders;
    private Instant insertedAt;
    private Instant updatedAt;

    public Long getId() {
        return id;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public List<String> getStatus() {
        List<EStatus> status = List.of(EStatus.values());

        return status.stream()
                .map(Enum::name)
                .toList();
    }

    public Instant insertedAt() {
        return Instant.now();
    }

    public Instant updatedAt() {
        return Instant.now();
    }
}
