package com.github.egotting.BackEnd.Domain.entities.Category;


import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Name;
import com.github.egotting.BackEnd.Domain.entities.Products.Products;

import java.util.UUID;

public class Category {
    private UUID id;
    private Name name;
    private Products products;
}
