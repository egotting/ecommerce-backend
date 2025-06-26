package com.github.egotting.BackEnd.Adapters.out.persistence.entities.Category;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Products.*;
import com.github.egotting.BackEnd.Domain.entities.Category.*;
import jakarta.persistence.*;
import lombok.*;

import java.time.*;
import java.util.*;

@Entity
@Table(name = "categories")
@Getter
public class JpaCategory {
    @Deprecated
    public JpaCategory() {

    }

    public JpaCategory(Category domain) {
        this.id = domain.getId();
        this.name = domain.getName();
        this.products = domain.getProducts().stream().map(JpaProducts::new).toList();
        this.insertedAt = domain.insertedAt();
        this.updatedAt = domain.updatedAt();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(nullable = false, unique = true)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<JpaProducts> products;
    @Column(nullable = false, name = "created_at")
    private Instant insertedAt;
    @Column(nullable = false, name = "updated_at")
    private Instant updatedAt;
}
