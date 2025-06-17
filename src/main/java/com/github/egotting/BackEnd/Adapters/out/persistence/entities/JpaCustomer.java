package com.github.egotting.BackEnd.Adapters.out.persistence.entities;


import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Customer;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.util.List;
import java.util.UUID;

@Table(name = "customers")
@Entity
@Getter
@Setter
public class JpaCustomer {
    public JpaCustomer() {

    }

    public JpaCustomer(Customer customer) {
        this.id = customer.getId();
        this.user = new JpaUser(customer.getUser());
        this.fullName = customer.getFullName();
        this.cpf = customer.getCpfValue();
        this.address = customer.getAddress();
        this.phoneNumber = customer.getPhoneNumber();
        this.orders = new JpaOrders(customer.getOrders());
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
    @Column(name = "customer_address", nullable = false)
    private String address;
    @Email
    @JoinColumn(name = "user_email", nullable = false, unique = true)
    @OneToOne
    private JpaUser email;
    @Column(name = "customer_phone_number", nullable = false)
    @Size(min = 1, max = 100)
    private String phoneNumber;
    @Column(name = "customer_orders")
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<JpaOrders> orders;


}
