package com.github.egotting.BackEnd.Domain.entities.Orders;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Identity;
import com.github.egotting.BackEnd.Domain.entities.Orders.ValueObjects.StatusOrders;
import com.github.egotting.BackEnd.Domain.entities.Payment.Payment;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Customer;
import com.github.egotting.BackEnd.Domain.entities.ProductsOrders.ProductsOrders;

import java.time.Instant;

public class Orders {
    private Identity id;
    private Instant data_order;
    private StatusOrders status_orders;
    private Customer owner_order;
    private ProductsOrders products_orders;
    private Payment payment;
}
