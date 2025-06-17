package com.github.egotting.BackEnd.Adapters.out.persistence.entities;

import com.github.egotting.BackEnd.Domain.entities.Person.User.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;


@Table(name = "user")
@Entity
@Getter
@Setter
public class JpaUser {

    public JpaUser() {
    }

    public JpaUser(User user) {
        this.id = user.getId();
        this.nickname = user.getNickname();
        this.email = user.getEmail();
        this.password = user.getPassword();
        createdAt = LocalDateTime.now();
        isActive = false;
    }

    @Id
    @Column(nullable = false, name = "id")
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
    @Column(nullable = false, name = "createdat")
    private LocalDateTime createdAt;
    @Column(nullable = false, name = "isactive")
    private boolean isActive;

}
