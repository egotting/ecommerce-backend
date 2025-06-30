package com.github.egotting.BackEnd.Adapters.out.persistence.repositories.Jpa.Person.Admin;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.Admin.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface JpaAdminRepository extends JpaRepository<JpaAdmin, UUID> {
}
