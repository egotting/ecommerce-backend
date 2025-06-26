package com.github.egotting.BackEnd.Domain.entities.Payment.ValueObjects;

import com.github.egotting.BackEnd.Domain.entities.Payment.Enum.PaymentsMethods;

public class PaymentMethod {
    private PaymentsMethods value;

    public PaymentMethod(PaymentsMethods method) {
        if (method == null) {
            throw new IllegalArgumentException("Payment method cannot be null");
        }
        this.value = method;
    }

    public String getValue() {
        return value.toString();
    }
}
