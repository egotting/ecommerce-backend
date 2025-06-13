package com.github.egotting.BackEnd.Domain.entities.Products;


import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Quantity;
import com.github.egotting.BackEnd.Domain.entities.Products.Object.ProductInfo;

import java.util.UUID;

public class Products {
    private UUID id;
    private ProductInfo productInfo;
    private Quantity quantity_stock;
}
