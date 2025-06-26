package com.github.egotting.BackEnd.Adapters.out.persistence.entities.Roles;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.Admin.*;
import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.Customer.*;
import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.User.*;
import com.github.egotting.BackEnd.Domain.entities.Roles.*;
import jakarta.persistence.*;
import lombok.*;

import java.time.*;
import java.util.*;
import java.util.stream.*;

@Entity
@Table(name = "roles")
@Getter
public class JpaRoles {

    @Deprecated
    public JpaRoles() {
    }

    public JpaRoles(Roles domain) {
        this.id = domain.getId();
        this.role = domain.getName();
        this.users = domain.getUsers().stream().map(JpaUser::new).collect(Collectors.toList());
        this.customers = domain.getCustomers().stream().map(JpaCustomer::new).collect(Collectors.toList());
        this.admins = domain.getAdmins().stream().map(JpaAdmin::new).collect(Collectors.toList());
        this.insertedAt = domain.insertedAt();
        this.updatedAt = domain.updatedAt();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(name = "roles", nullable = false, unique = true)
    private String role;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<JpaUser> users;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<JpaCustomer> customers;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<JpaAdmin> admins;
    @Column(name = "inserted_at", nullable = false)
    private Instant insertedAt;
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}
