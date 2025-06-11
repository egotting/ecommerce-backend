package com.github.egotting.BackEnd.Domain.entities.Orders.Enum;

public enum Status {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELED,
    RETURNED,
    REFUNDED,
    FAILED
}