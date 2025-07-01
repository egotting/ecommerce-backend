package com.github.egotting.BackEnd.Domain.entities.Orders;

import com.github.egotting.BackEnd.Domain.entities.Payment.*;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.*;
import com.github.egotting.BackEnd.Domain.entities.ProductsOrders.*;
import com.github.egotting.BackEnd.Domain.entities.States.*;

import java.time.*;
import java.util.*;

public class Orders {
    public Orders() {
    }

    public Orders(Long id, Status status_orders, List<ProductsOrders> products_orders, Payment payment) {
        this.id = id;
        this.status_orders = status_orders;
        this.owner_order.getCpf();
        this.products_orders = products_orders;
        this.payment = payment;
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    private Long id;
    private Status status_orders;
    private Customer owner_order;
    private List<ProductsOrders> products_orders;
    private Payment payment;
    private Instant insertedAt;
    private Instant updatedAt;

    public Long getId() {
        return id;
    }

    public List<String> getStatus_orders() {
        return status_orders.getStatus();
    }

    public Customer getOwner_order() {
        return owner_order;
    }

    public List<ProductsOrders> getProducts_orders() {
        return products_orders;
    }

    public Payment getPayment() {
        return payment;
    }

    public Instant insertedAt() {
        return Instant.now();
    }

    public Instant updatedAt() {
        return Instant.now();
    }


}
