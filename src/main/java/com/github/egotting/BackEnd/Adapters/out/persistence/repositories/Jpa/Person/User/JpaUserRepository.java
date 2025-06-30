package com.github.egotting.BackEnd.Adapters.out.persistence.repositories.Jpa.Person.User;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.User.JpaUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaUserRepository extends JpaRepository<JpaUser, UUID> {
}
