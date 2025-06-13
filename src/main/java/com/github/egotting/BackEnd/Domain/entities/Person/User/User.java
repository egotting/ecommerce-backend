package com.github.egotting.BackEnd.Domain.entities.Person.User;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Email;
import com.github.egotting.BackEnd.Domain.entities.Person.User.Objects.AccountInfo;
import com.github.egotting.BackEnd.Domain.entities.Person.User.ValueObjects.Password;

import java.util.UUID;


public class User {

    public User(String nickname, Password password, Email email, AccountInfo accountInfo) {
        this.id = UUID.randomUUID();
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.accountInfo = accountInfo;
    }

    private UUID id;
    private String nickname;
    private Email email;
    private Password password;
    private AccountInfo accountInfo;

    public UUID getId() {
        return id;
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


}
