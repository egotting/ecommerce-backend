package com.github.egotting.BackEnd.Domain.entities.Products.Object;

import com.github.egotting.BackEnd.Domain.entities.Category.Category;

import java.math.BigDecimal;

public class ProductInfo {

    public ProductInfo(String name, String description, BigDecimal price, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    private String name;
    private String description;
    private BigDecimal price;
    private Category category;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCategory() {
        return category.getName();
    }
}
