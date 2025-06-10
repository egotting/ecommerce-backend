package com.github.egotting.BackEnd.Adapters.out.persistence.repositories.Jpa;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.JpaUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaUserRepository extends JpaRepository<JpaUser, UUID> {
}
