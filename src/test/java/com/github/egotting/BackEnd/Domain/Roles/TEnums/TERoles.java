package com.github.egotting.BackEnd.Domain.Roles.TEnums;

public enum TERoles {
    USER("user"),
    CUSTOMER("customer"),
    ADMIN("admin");

    private String role;

    TERoles(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
