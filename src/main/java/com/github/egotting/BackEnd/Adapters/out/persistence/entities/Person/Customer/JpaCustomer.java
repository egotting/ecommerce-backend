package com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.Customer;


import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Address.*;
import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Orders.*;
import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.User.*;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.br.*;

import java.time.*;
import java.util.*;
import java.util.stream.*;

@Entity
@Table(name = "customers")
@Getter
@Setter
public class JpaCustomer {

    @Deprecated
    public JpaCustomer() {

    }

    public JpaCustomer(Customer customer) {
        this.id = customer.getId();
        this.user = new JpaUser(customer.getUser());
        this.fullName = customer.getFullName();
        this.cpf = customer.getCpf();
        this.phoneNumber = customer.getPhone();
        this.role = customer.getCustomerRole();
        this.address = customer.getAddress().stream().map(JpaAddress::new).collect(Collectors.toList());
        this.orders = customer.getOrders().stream().map(JpaOrders::new).toList();
        this.insertedAt = customer.insertedAt();
        this.updatedAt = customer.updatedAt();
    }

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private JpaUser user;
    @Column(name = "full_name", nullable = false)
    @Size(min = 1, max = 100)
    private String fullName;
    @Column(name = "customer_cpf", nullable = false, unique = true)
    @CPF
    private String cpf;
    @Column(name = "customer_phone_number", nullable = false)
    @Size(min = 1, max = 100)
    private String phoneNumber;
    @Column(name = "customer_role", nullable = false, unique = true)
    private String role;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_addresses", nullable = false)
    private List<JpaAddress> address;
    @JoinColumn(name = "customer_orders")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<JpaOrders> orders;
    @Column(nullable = false, name = "created_at")
    private Instant insertedAt;
    @Column(nullable = false, name = "updated_at")
    private Instant updatedAt;


}
