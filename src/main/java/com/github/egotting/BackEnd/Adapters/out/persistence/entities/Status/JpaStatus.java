package com.github.egotting.BackEnd.Adapters.out.persistence.entities.Status;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Orders.*;
import com.github.egotting.BackEnd.Domain.entities.States.*;
import jakarta.persistence.*;
import lombok.*;

import java.time.*;
import java.util.*;

@Entity
@Table(name = "statuses")
@Getter
public class JpaStatus {
    public JpaStatus() {
    }

    public JpaStatus(Status domain) {
        this.id = domain.getId();
        this.status = domain.getStatus();
        this.orders = domain.getOrders().stream().map(JpaOrders::new).toList();
        this.insertedAt = domain.insertedAt();
        this.updatedAt = domain.updatedAt();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(name = "status", nullable = false, unique = true)
    private String status;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<JpaOrders> orders;
    @Column(nullable = false, name = "created_at")
    private Instant insertedAt;
    @Column(nullable = false, name = "updated_at")
    private Instant updatedAt;
}
