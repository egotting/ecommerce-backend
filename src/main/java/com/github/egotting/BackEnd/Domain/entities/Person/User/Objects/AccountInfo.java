package com.github.egotting.BackEnd.Domain.entities.Person.User.Objects;

import java.time.LocalDateTime;

public class AccountInfo {
    public AccountInfo() {
        this.createdAt = LocalDateTime.now();
        this.isActive = true;
    }

    private LocalDateTime createdAt;
    private boolean isActive;
}
