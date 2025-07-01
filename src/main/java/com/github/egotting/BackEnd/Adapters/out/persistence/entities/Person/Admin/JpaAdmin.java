package com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.Admin;

import com.github.egotting.BackEnd.Domain.entities.Person.Admin.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.br.*;

import java.time.*;
import java.util.*;

@Entity
@Table(name = "admins")
@Getter
public class JpaAdmin {
    @Deprecated
    public JpaAdmin() {
    }

    public JpaAdmin(Admin domain) {
        this.id = domain.getId();
        this.fullname = domain.getFullname();
        this.cpf = domain.getCpf();
        this.password = domain.getPassword();
        this.phoneNumber = domain.getPhoneNumber();
        this.key = domain.getKey();
        this.role = domain.getRole();
        this.insertedAt = domain.insertedAt();
        this.updatedAt = domain.updatedAt();
        this.isActive = domain.isActive();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", unique = true, nullable = false)
    private UUID id;
    @Column(nullable = false, unique = true)
    @CPF
    private String cpf;
    @Column(nullable = false)
    @Size(min = 1, max = 100, message = "Full name must be between 1 and 100 characters")
    private String fullname;
    @Column(nullable = false)
    @Size(min = 8, max = 35, message = "Nickname must be between 8 and 35 characters")
    private String password;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column(nullable = false, unique = true)
    private String key;
    @Column(name = "admin_role", nullable = false, unique = true)
    private String role;
    @Column(nullable = false, name = "created_at")
    private Instant insertedAt;
    @Column(nullable = false, name = "updated_at")
    private Instant updatedAt;
    @Column(nullable = false, name = "isactive")
    private boolean isActive;
}
