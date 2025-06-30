package com.github.egotting.BackEnd.Adapters.out.persistence.repositories.Jpa.Person.Customer;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.Customer.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface JpaCustomerRepository extends JpaRepository<JpaCustomer, UUID> {
}
