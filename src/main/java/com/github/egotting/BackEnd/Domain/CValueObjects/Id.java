package com.github.egotting.BackEnd.Domain.CValueObjects;

import java.util.UUID;

public class Id {
    private UUID id;

    public Id() {
        if (isValid()) {
            throw new IllegalArgumentException("Invalid ID");
        }
        this.id = UUID.randomUUID();
    }


    public boolean isValid() {
        return this.id == null && id.toString().isEmpty();
    }

}
