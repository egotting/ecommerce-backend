package com.github.egotting.BackEnd.Adapters.out.persistence.entities.Products;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Category.*;
import com.github.egotting.BackEnd.Domain.entities.Products.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.*;
import java.time.*;

@Entity
@Table(name = "products")
@Getter
@Setter
public class JpaProducts {
    @Deprecated
    public JpaProducts() {

    }

    public JpaProducts(Products domain) {
        this.id = domain.getId();
        this.name = domain.getName();
        this.description = domain.getDescription();
        this.price = domain.getPrice();
        this.category = new JpaCategory(domain.getCategory());
        this.quantity_stock = domain.getQuantity_stock();
        this.insertedAt = domain.insertedAt();
        this.updatedAt = domain.updatedAt();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(nullable = false, unique = true)
    @Size(min = 1, max = 100)
    private String name;
    @Column(nullable = false)
    @Size(min = 1, max = 100)
    private String description;
    @Column(name = "price", precision = 10, scale = 2, nullable = false)
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private JpaCategory category;
    @Column(nullable = false)
    @Size(min = 1, max = 100)
    private int quantity_stock;
    @Column(nullable = false, name = "created_at")
    private Instant insertedAt;
    @Column(nullable = false, name = "updated_at")
    private Instant updatedAt;

}
