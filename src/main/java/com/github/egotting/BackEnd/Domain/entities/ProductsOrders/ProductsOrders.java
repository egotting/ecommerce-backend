package com.github.egotting.BackEnd.Domain.entities.ProductsOrders;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Quantity;
import com.github.egotting.BackEnd.Domain.entities.Orders.Orders;
import com.github.egotting.BackEnd.Domain.entities.Products.Products;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductsOrders {
    private UUID id;
    private Orders orders;
    private Products products;
    private Quantity quantity;
    private BigDecimal price;
}
