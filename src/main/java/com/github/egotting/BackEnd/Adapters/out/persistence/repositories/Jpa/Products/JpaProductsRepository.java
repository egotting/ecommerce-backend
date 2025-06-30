package com.github.egotting.BackEnd.Adapters.out.persistence.repositories.Jpa.Products;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.ProductsOrders.*;
import org.hibernate.validator.constraints.*;
import org.springframework.data.jpa.repository.*;

public interface JpaProductsRepository extends JpaRepository<JpaProductsOrders, UUID> {
}
