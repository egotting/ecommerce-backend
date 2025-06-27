package com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.User;

import com.github.egotting.BackEnd.Domain.entities.Person.User.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.*;
import java.util.*;


@Table(name = "users")
@Entity
@Getter
@Setter
public class JpaUser {

    @Deprecated
    public JpaUser() {
    }

    public JpaUser(User domain) {
        this.id = domain.getId();
        this.nickname = domain.getNickname();
        this.email = domain.getEmail();
        this.password = domain.getPassword();
        this.role = domain.getRole();
        this.insertedAt = domain.insertedAt();
        this.updatedAt = domain.updatedAt();
        this.isActive = domain.isActive();
    }

    @Id
    @Column(nullable = false, name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false, name = "name")
    @Size(min = 1, max = 100, message = "Name must be between 1 and 100 characters")
    private String nickname;
    @Column(nullable = false, name = "email")
    @Email(message = "Email should be valid")
    @Size(max = 255, message = "Email must not exceed 255 characters")
    private String email;
    @Column(nullable = false, name = "password")
    @Size(min = 8, max = 32, message = "Password must be between 8 and 32 characters")
    private String password;
    @Column(name = "user_role", nullable = false, unique = true)
    private String role;
    @Column(nullable = false, name = "created_at")
    private Instant insertedAt;
    @Column(nullable = false, name = "updated_at")
    private Instant updatedAt;
    @Column(nullable = false, name = "is_active")
    private boolean isActive;

}
