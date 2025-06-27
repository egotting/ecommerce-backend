package com.github.egotting.BackEnd.Domain.Roles;


import com.github.egotting.BackEnd.Domain.entities.Person.Customer.*;
import com.github.egotting.BackEnd.Domain.entities.Roles.*;
import org.junit.jupiter.api.*;

public class RolesTest {

    @Test
    void testGetRoles() {
        var roles = new Roles();
        System.out.println(roles.getRoles());
    }

    @Test
    void testGetRoleByName() {
        var roles = new Customer();
        System.out.println(roles.getRole());
    }
}
