package com.github.egotting.BackEnd.Adapters.out.persistence.repositories.Jpa.ProductsOrders;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.ProductsOrders.*;
import org.hibernate.validator.constraints.*;
import org.springframework.data.jpa.repository.*;

public interface JpaProductsOrdersRepository extends JpaRepository<JpaProductsOrders, UUID> {
}
