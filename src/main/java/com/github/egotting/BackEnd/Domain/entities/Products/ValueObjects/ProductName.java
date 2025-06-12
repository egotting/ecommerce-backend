package com.github.egotting.BackEnd.Domain.entities.Products.ValueObjects;

import java.util.Objects;

public class ProductName {
    private String nameProduct;

    public ProductName(String nameProduct) {
        if (!isValid(nameProduct)) throw new IllegalArgumentException("Invalid product name");
        this.nameProduct = nameProduct;
    }

    private boolean isValid(String nameProduct) {
        if (nameProduct == null && nameProduct.isEmpty()) return false;

        if (!nameProduct.matches("^[A-Za-zÀ-ÿ\\s]+$")) return false;
        return true;
    }


    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductName that = (ProductName) o;
        return Objects.equals(nameProduct, that.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nameProduct);
    }

    @Override
    public String toString() {
        return "ProductName{" + "nameProduct='" + nameProduct + '\'' + '}';
    }
}
