package com.github.egotting.BackEnd.Adapters.out.persistence.repositories.Jpa.Category;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.ProductsOrders.*;
import org.springframework.data.jpa.repository.*;

import java.util.UUID;

public interface JpaCategoryRepository extends JpaRepository<JpaProductsOrders, UUID> {
}
