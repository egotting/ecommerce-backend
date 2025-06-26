package com.github.egotting.BackEnd.Adapters.out.persistence.entities.Orders;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.Customer.*;
import com.github.egotting.BackEnd.Adapters.out.persistence.entities.ProductsOrders.*;
import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Status.*;
import com.github.egotting.BackEnd.Domain.entities.Orders.Orders;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "orders")
public class JpaOrders {

    @Deprecated
    public JpaOrders() {
    }

    public JpaOrders(Orders domain) {
        this.id = domain.getId();
        this.data_order = domain.getData_order();
        this.order_status = new JpaStatus(domain.getStatus_orders());
        this.customer_owner = new JpaCustomer(domain.getOwner_order());
        this.products_order = domain.getProducts_orders().stream().map(JpaProductsOrders::new).toList();
        this.insertedAt = domain.insertedAt();
        this.updatedAt = domain.updatedAt();
    }

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private Instant data_order;
    @ManyToOne
    @JoinColumn(nullable = false, unique = true)
    private JpaStatus order_status;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private JpaCustomer customer_owner;

    @OneToMany
    @JoinColumn(name = "productsOrders_id", nullable = false)
    private List<JpaProductsOrders> products_order;
    @Column(nullable = false, name = "created_at")
    private Instant insertedAt;
    @Column(nullable = false, name = "updated_at")
    private Instant updatedAt;
}
