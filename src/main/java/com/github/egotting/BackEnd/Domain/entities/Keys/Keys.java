package com.github.egotting.BackEnd.Domain.entities.Keys;

import com.github.egotting.BackEnd.Domain.entities.Person.Admin.*;

import java.time.*;

public class Keys {
    public Keys() {
    }

    public Keys(Long id) {
        this.id = id;
        this.key.getKey();
        this.owner_key.getCpf();
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    private Long id;
    private Admin key;
    private Admin owner_key;
    private Instant insertedAt;
    private Instant updatedAt;

    public Long getId() {
        return id;
    }

    public Admin getKey() {
        return owner_key;
    }

    public Admin getOnwerKey() {
        return owner_key;
    }

    public Instant insertedAt() {
        return Instant.now();
    }

    public Instant updatedAt() {
        return Instant.now();
    }

}
