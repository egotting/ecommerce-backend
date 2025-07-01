package com.github.egotting.BackEnd.Adapters.out.persistence.entities.ProductsOrders;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Orders.*;
import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Products.*;
import com.github.egotting.BackEnd.Domain.entities.ProductsOrders.ProductsOrders;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.*;

@Entity
@Table(name = "products_orders")
public class JpaProductsOrders {

    @Deprecated
    public JpaProductsOrders() {
    }

    public JpaProductsOrders(ProductsOrders domain) {
        this.id = domain.getId();
        this.orders = new JpaOrders(domain.getIdOrders());
        this.products = new JpaProducts(domain.getProducts());
        this.quantity = domain.getQuantity();
        this.purchaseAtPrice = domain.getPriceValue();
        this.totalPrice = domain.getTotalPrice();
        this.insertedAt = domain.insertedAt();
        this.updatedAt = domain.updatedAt();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id", insertable = false, updatable = false)
    private JpaOrders orders;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    private JpaProducts products;
    @Column(nullable = false)
    @Size(min = 1)
    private int quantity;
    @Column(name = "purchaseAtPrice", nullable = false)
    private BigDecimal purchaseAtPrice;
    @Column(name = "total_price", precision = 10, scale = 2, nullable = false)
    private BigDecimal totalPrice;
    @Column(nullable = false, name = "created_at")
    private Instant insertedAt;
    @Column(nullable = false, name = "updated_at")
    private Instant updatedAt;
}
