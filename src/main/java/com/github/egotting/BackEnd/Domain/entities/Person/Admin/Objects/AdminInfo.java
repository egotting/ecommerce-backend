package com.github.egotting.BackEnd.Domain.entities.Person.Admin.Objects;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.*;
import com.github.egotting.BackEnd.Domain.entities.Person.Admin.ValueObjects.*;
import com.github.egotting.BackEnd.Domain.entities.Person.User.ValueObjects.*;
import com.github.egotting.BackEnd.Domain.entities.Roles.*;

public class AdminInfo {

    public AdminInfo() {
    }

    public AdminInfo(String fullname, Password password, Phone phoneNumber, Key key) {
        this.fullname = fullname;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.key = key;
        this.role = role.getNameAdmin();
    }

    private String fullname;
    private Password password;
    private Phone phoneNumber;
    private Key key;
    private Roles role;

    public String getFullname() {
        return fullname;
    }

    public String getPassword() {
        return password.getValue();
    }

    public String getPhoneNumber() {
        return phoneNumber.getValue();
    }

    public String getKey() {
        return key.getValue();
    }

    public Roles getAdminRole() {
        return role.getNameAdmin();
    }
}
