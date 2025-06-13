package com.github.egotting.BackEnd.Adapters.out.persistence.entities;

import com.github.egotting.BackEnd.Domain.entities.Person.User.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Table(name = "user_tb")
@Entity
@Getter
@Setter
public class JpaUser {
    @Id
    @Column(nullable = false, name = "user_id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false, name = "user_name")
    @Size(min = 1, max = 100, message = "Name must be between 1 and 100 characters")
    private String nickname;
    @Column(nullable = false, name = "user_email")
    @Email
    private String email;
    @Column(nullable = false, name = "user_password")
    @Size(min = 8, max = 32)
    private String password;

    public JpaUser() {
    }

    public JpaUser(User user) {
        this.id = user.getId();
        this.nickname = user.getNickname();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }
}
