package com.github.egotting.BackEnd.Domain.entities.Category;


import com.github.egotting.BackEnd.Domain.entities.Products.Products;

import java.util.UUID;


public class Category {
    public Category(String name, Products products) {
        this.name = name;
        this.products = products;
    }

    private UUID id;
    private String name;
    private Products products;

    public String getName() {
        return name;
    }

}
