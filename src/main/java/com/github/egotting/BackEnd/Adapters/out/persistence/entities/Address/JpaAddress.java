package com.github.egotting.BackEnd.Adapters.out.persistence.entities.Address;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.Customer.*;
import com.github.egotting.BackEnd.Domain.entities.Address.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "addresses")
@Getter
public class JpaAddress {

    @Deprecated
    public JpaAddress() {
    }

    public JpaAddress(Address domain) {
        this.id = domain.getId();
        this.street = domain.getStreet();
        this.city = domain.getCity();
        this.state = domain.getState();
        this.zpc = domain.getZpc();
        this.user = new JpaCustomer(domain.getUser());
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(name = "street", nullable = false)
    private String street;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "state", nullable = false)
    private String state;
    @Column(name = "zpc", nullable = false)
    private String zpc;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private JpaCustomer user;
}
