package com.github.egotting.BackEnd.Adapters.out.persistence.repositories.Jpa.Orders;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.ProductsOrders.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface JpaOrdersRepository extends JpaRepository<JpaProductsOrders, UUID> {
}
