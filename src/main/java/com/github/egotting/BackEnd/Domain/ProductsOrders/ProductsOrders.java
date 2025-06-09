package com.github.egotting.BackEnd.Domain.ProductsOrders;

import com.github.egotting.BackEnd.Domain.CValueObjects.Id;
import com.github.egotting.BackEnd.Domain.CValueObjects.Quantity;
import com.github.egotting.BackEnd.Domain.CValueObjects.Value;
import com.github.egotting.BackEnd.Domain.Orders.Orders;
import com.github.egotting.BackEnd.Domain.Products.Products;

public class ProductsOrders {
    private Id id;
    private Orders orders;
    private Products products;
    private Quantity quantity;
    private Value price;
}
