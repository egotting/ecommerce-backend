package com.github.egotting.BackEnd.Domain.entities.ProductsOrders;

import com.github.egotting.BackEnd.Domain.entities.Orders.Orders;
import com.github.egotting.BackEnd.Domain.entities.Products.Products;

import java.math.BigDecimal;
import java.time.*;

public class ProductsOrders {
    public ProductsOrders() {
    }

    public ProductsOrders(Long id, Orders orders, Products products, Integer quantity, BigDecimal priceAtPurchase, BigDecimal totalPrice) {
        this.id = id;
        this.id_orders = orders;
        this.id_products = products;
        this.quantity = quantity;
        this.priceAtPurchase = priceAtPurchase;
        this.totalPrice = totalPrice;
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    private Long id;
    private Orders id_orders;
    private Products id_products;
    private Integer quantity;
    private BigDecimal priceAtPurchase;
    private BigDecimal totalPrice;
    private Instant insertedAt;
    private Instant updatedAt;

    public Long getId() {
        return id;
    }

    public Orders getIdOrders() {
        return id_orders;
    }

    public Products getProducts() {
        return id_products;
    }

    public BigDecimal getPriceValue() {
        return priceAtPurchase;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public BigDecimal getTotalPrice() {
        this.totalPrice = SumTotalPrice();
        return totalPrice;
    }

    public Instant insertedAt() {
        return Instant.now();
    }

    public Instant updatedAt() {
        return Instant.now();
    }


    private BigDecimal SumTotalPrice() {
        return priceAtPurchase.multiply(BigDecimal.valueOf(quantity));
    }
}
