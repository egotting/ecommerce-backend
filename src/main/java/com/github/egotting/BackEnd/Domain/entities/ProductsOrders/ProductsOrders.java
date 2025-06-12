package com.github.egotting.BackEnd.Domain.entities.ProductsOrders;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Identity;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Quantity;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Value;
import com.github.egotting.BackEnd.Domain.entities.Orders.Orders;
import com.github.egotting.BackEnd.Domain.entities.Products.Products;

// TODO: Impl Products
public class ProductsOrders {
    private Identity id;
    private Orders orders;
    private Products products;
    private Quantity quantity;
    private Value price;
}
