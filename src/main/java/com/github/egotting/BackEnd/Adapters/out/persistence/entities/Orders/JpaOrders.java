package com.github.egotting.BackEnd.Adapters.out.persistence.entities.Orders;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.Customer.*;
import com.github.egotting.BackEnd.Adapters.out.persistence.entities.ProductsOrders.*;
import com.github.egotting.BackEnd.Domain.entities.Orders.*;
import jakarta.persistence.*;

import java.time.*;
import java.util.*;

@Entity
@Table(name = "orders")
public class JpaOrders {

    @Deprecated
    public JpaOrders() {
    }

    public JpaOrders(Orders domain) {
        this.id = domain.getId();
        this.order_status = domain.getStatus_orders();
        this.customer_owner = new JpaCustomer(domain.getOwner_order());
        this.products_order = domain.getProducts_orders().stream().map(JpaProductsOrders::new).toList();
        this.insertedAt = domain.insertedAt();
        this.updatedAt = domain.updatedAt();
    }

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, name = "order_status", unique = true)
    private List<String> order_status;
    @ManyToOne
    @JoinColumn(name = "customer_id",
            referencedColumnName = "id", insertable = false,
            updatable = false, nullable = false)
    private JpaCustomer customer_owner;
    @OneToMany
    @JoinColumn(name = "productsOrders_id", nullable = false)
    private List<JpaProductsOrders> products_order;
    @Column(nullable = false, name = "inserted_at")
    private Instant insertedAt;
    @Column(nullable = false, name = "updated_at")
    private Instant updatedAt;
}
