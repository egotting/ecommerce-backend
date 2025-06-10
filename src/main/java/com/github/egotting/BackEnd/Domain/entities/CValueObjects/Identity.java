package com.github.egotting.BackEnd.Domain.entities.CValueObjects;

import java.util.UUID;

public class Identity {
    private UUID id;

    public Identity() {
        if (isValid()) {
            throw new IllegalArgumentException("Invalid ID");
        }
        this.id = UUID.randomUUID();
    }


    public boolean isValid() {
        return this.id == null && id.toString().isEmpty();
    }

}
