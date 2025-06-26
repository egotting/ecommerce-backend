package com.github.egotting.BackEnd.Domain.entities.Person.User;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Email;
import com.github.egotting.BackEnd.Domain.entities.Person.User.Objects.AccountInfo;
import com.github.egotting.BackEnd.Domain.entities.Person.User.ValueObjects.Password;
import com.github.egotting.BackEnd.Domain.entities.Roles.*;

import java.time.*;
import java.util.UUID;


public class User {

    public User() {
    }

    public User(String nickname, Password password, Email email) {
        this.id = UUID.randomUUID();
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.accountInfo = new AccountInfo();
    }

    private UUID id;
    private String nickname;
    private Email email;
    private Password password;
    private AccountInfo accountInfo;

    public UUID getId() {
        return UUID.randomUUID();
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email.getValue();
    }

    public String getPassword() {
        return password.getValue();
    }

    public Roles getUserRole() {
        return accountInfo.getRole();
    }

    public Instant insertedAt() {
        return Instant.now();
    }

    public Instant updatedAt() {
        return Instant.now();
    }

    public boolean isActive() {
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", email=" + email +
                ", password=" + password +
                ", accountInfo=" + accountInfo +
                '}';
    }
}
