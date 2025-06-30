package com.github.egotting.BackEnd.Adapters.out.persistence.repositories.Jpa.Person.User;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.User.JpaUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import java.util.UUID;

@Repository
public interface JpaUserRepository extends JpaRepository<JpaUser, UUID> {
}
