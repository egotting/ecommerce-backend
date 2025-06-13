package com.github.egotting.BackEnd.Domain.entities.ProductsOrders;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Quantity;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Value;
import com.github.egotting.BackEnd.Domain.entities.Orders.Orders;
import com.github.egotting.BackEnd.Domain.entities.Products.Products;

import java.util.UUID;

public class ProductsOrders {
    private UUID id;
    private Orders orders;
    private Products products;
    private Quantity quantity;
    private Value price;
}
