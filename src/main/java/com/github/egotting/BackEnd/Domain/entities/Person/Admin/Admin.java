package com.github.egotting.BackEnd.Domain.entities.Person.Admin;

import com.github.egotting.BackEnd.Domain.entities.Person.Admin.Objects.*;
import com.github.egotting.BackEnd.Domain.entities.Roles.*;

import java.time.*;
import java.util.*;

public class Admin {
    public Admin(IdAdmin id, AdminInfo adminInfo) {
        this.id = id;
        this.adminInfo = adminInfo;
    }

    private IdAdmin id;
    private AdminInfo adminInfo;

    public UUID getId() {
        return id.getId();
    }

    public String getFullName() {
        return adminInfo.getFullname();
    }

    public String getPassword() {
        return adminInfo.getPassword();
    }

    public String getCpf() {
        return id.getCpf().getValue();
    }


    public String getPhoneNumber() {
        return adminInfo.getPhoneNumber();
    }

    public Roles getRole() {
        return adminInfo.getAdminRole();
    }

    public String getKey() {
        return adminInfo.getKey();
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
}
