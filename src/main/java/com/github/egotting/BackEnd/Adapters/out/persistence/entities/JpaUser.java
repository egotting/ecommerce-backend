package com.github.egotting.BackEnd.Adapters.out.persistence.entities;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Email;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Identity;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Name;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Customer;
import com.github.egotting.BackEnd.Domain.entities.Person.User.User;
import com.github.egotting.BackEnd.Domain.entities.Person.User.ValueObjects.Password;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.*;


@Table(name = "user_tb")
@Entity
@Getter
@Setter
public class JpaUser {
    @EmbeddedId
    @Column(nullable = false, name = "user_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private Identity id;
    @Embedded
    @Column(nullable = false, name = "user_name")
    @Size(min = 1, max = 100, message = "Name must be between 1 and 100 characters")
    private Name name;
    @Embedded
    @Column(nullable = false, name = "user_email")
    @jakarta.validation.constraints.Email
    private Email email;
    @Embedded
    @Column(nullable = false, name = "user_password")
    @Size(min = 8, max = 32)
    private Password password;
    @Embedded
    private Customer customer;

    public JpaUser() {
    }

    public JpaUser(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.customer = user.getCustomer();
    }
}
