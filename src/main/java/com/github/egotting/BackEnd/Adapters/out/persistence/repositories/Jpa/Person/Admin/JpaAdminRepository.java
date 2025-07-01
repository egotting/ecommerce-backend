package com.github.egotting.BackEnd.Adapters.out.persistence.repositories.Jpa.Person.Admin;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.Admin.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface JpaAdminRepository extends JpaRepository<JpaAdmin, UUID> {

    @Modifying
    void updateAdmin(JpaAdmin admin);

    @Modifying
    void deleteAdmin(JpaAdmin admin, String key);

    Optional<JpaAdmin> findByCpf(String cpf);

    Optional<JpaAdmin> findByFullname(String fullname);
}
