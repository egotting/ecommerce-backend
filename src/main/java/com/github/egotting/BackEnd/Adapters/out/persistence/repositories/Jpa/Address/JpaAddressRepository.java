package com.github.egotting.BackEnd.Adapters.out.persistence.repositories.Jpa.Address;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Address.*;
import org.springframework.data.jpa.repository.*;

public interface JpaAddressRepository extends JpaRepository<JpaAddress, Long> {
}
