package com.github.egotting.BackEnd.Domain.Category;


import com.github.egotting.BackEnd.Domain.CValueObjects.Name;
import com.github.egotting.BackEnd.Domain.Products.Products;

import java.util.UUID;

public class Category {
    private UUID id;
    private Name name;
    private Products products;
}
