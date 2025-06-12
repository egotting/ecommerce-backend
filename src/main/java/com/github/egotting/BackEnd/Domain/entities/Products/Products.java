package com.github.egotting.BackEnd.Domain.entities.Products;


import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Identity;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Name;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Quantity;
import com.github.egotting.BackEnd.Domain.entities.Category.Category;
import com.github.egotting.BackEnd.Domain.entities.Products.ValueObjects.Description;
import com.github.egotting.BackEnd.Domain.entities.Products.ValueObjects.ProductName;

import java.math.BigDecimal;

public class Products {
    private Identity id;
    private ProductName name;
    private Description description;
    private BigDecimal price;
    private Quantity quantity_stock;
    private Category category;
}
