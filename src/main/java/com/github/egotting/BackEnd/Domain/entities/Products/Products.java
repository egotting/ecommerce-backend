package com.github.egotting.BackEnd.Domain.entities.Products;


import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Quantity;
import com.github.egotting.BackEnd.Domain.entities.Category.Category;
import com.github.egotting.BackEnd.Domain.entities.Products.Object.ProductInfo;

import java.math.BigDecimal;
import java.time.*;

public class Products {
    public Products(Long id, ProductInfo productInfo, Quantity quantity_stock) {
        this.id = id;
        this.productInfo = productInfo;
        this.quantity_stock = quantity_stock;
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    private Long id;
    private ProductInfo productInfo;
    private Quantity quantity_stock;
    private Instant insertedAt;
    private Instant updatedAt;

    public Long getId() {
        return id;
    }

    public String getName() {
        return productInfo.getName();
    }

    public String getDescription() {
        return productInfo.getDescription();
    }

    public BigDecimal getPrice() {
        return productInfo.getPrice();
    }

    public Category getCategory() {
        return productInfo.getCategory();
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
