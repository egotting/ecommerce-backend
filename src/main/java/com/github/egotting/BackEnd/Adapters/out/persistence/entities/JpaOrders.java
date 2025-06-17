package com.github.egotting.BackEnd.Adapters.out.persistence.entities;

import com.github.egotting.BackEnd.Domain.entities.Orders.ValueObjects.StatusOrders;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "orders")
public class JpaOrders {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private Instant data_order;
    @Embedded
    @Column(name = "order_status", nullable = false, unique = true)
    private StatusOrders order_status;
    @ManyToOne
    private JpaCustomer customer_owner;

    private JpaProductsOrders products_order;
}
