package com.github.egotting.BackEnd.Adapters.out.persistence.entities;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.Admin.*;
import com.github.egotting.BackEnd.Domain.entities.Keys.*;
import jakarta.persistence.*;
import lombok.*;

import java.time.*;

@Entity
@Table(name = "keys")
@Getter
public class JpaKeys {

    @Deprecated
    public JpaKeys() {
    }

    public JpaKeys(Keys domain) {
        this.id = domain.getId();
        this.key.getKey();
        this.owner_key.getCpf();
        this.insertedAt = domain.insertedAt();
        this.updatedAt = domain.updatedAt();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;
    @JoinColumn(name = "key_admin", referencedColumnName = "key",
            nullable = false, insertable = false, updatable = false)
    @OneToOne(cascade = CascadeType.ALL)
    private JpaAdmin key;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_key", referencedColumnName = "cpf",
            nullable = false, insertable = false, updatable = false)
    private JpaAdmin owner_key;
    @Column(nullable = false)
    private Instant insertedAt;
    @Column(nullable = false)
    private Instant updatedAt;
}
