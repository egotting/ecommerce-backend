package com.github.egotting.BackEnd.Domain.entities.Products;


import com.github.egotting.BackEnd.Domain.entities.CValueObjects.*;
import com.github.egotting.BackEnd.Domain.entities.Category.*;
import com.github.egotting.BackEnd.Domain.entities.ProductsOrders.*;

import java.math.*;
import java.time.*;
import java.util.*;

public class Products {
    public Products(
            Long id, String name, String description, BigDecimal price,
            Category category, List<ProductsOrders> products_orders, Quantity quantity_stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.products_orders = products_orders;
        this.quantity_stock = quantity_stock;
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Category category;
    private List<ProductsOrders> products_orders;
    private Quantity quantity_stock;
    private Instant insertedAt;
    private Instant updatedAt;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public List<ProductsOrders> getProducts_orders() {
        return products_orders;
    }

    public int getQuantity_stock() {
        return quantity_stock.getValue();
    }

    public Instant insertedAt() {
        return Instant.now();
    }

    public Instant updatedAt() {
        return Instant.now();
    }


}
