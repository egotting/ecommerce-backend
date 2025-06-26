package com.github.egotting.BackEnd.Domain.entities.Category;


import com.github.egotting.BackEnd.Domain.entities.Category.Enum.CategoryNames;
import com.github.egotting.BackEnd.Domain.entities.Products.Products;

import java.time.*;
import java.util.List;


public class Category {
    public Category(Long id, CategoryNames name, List<Products> products) {
        this.id = id;
        this.name = name;
        this.products = products;
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    private Long id;
    private CategoryNames name;
    private List<Products> products;
    private Instant insertedAt;
    private Instant updatedAt;


    public String getName() {
        return name.name();
    }

    public Long getId() {
        return id;
    }

    public List<Products> getProducts() {
        return products;
    }

    public Instant insertedAt() {
        return Instant.now();
    }

    public Instant updatedAt() {
        return Instant.now();
    }


}
