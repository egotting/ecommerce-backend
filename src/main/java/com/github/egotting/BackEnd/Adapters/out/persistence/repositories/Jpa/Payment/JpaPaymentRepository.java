package com.github.egotting.BackEnd.Adapters.out.persistence.repositories.Jpa.Payment;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Payment.*;
import org.springframework.data.jpa.repository.*;

public interface JpaPaymentRepository extends JpaRepository<JpaPayment, Long> {
}
