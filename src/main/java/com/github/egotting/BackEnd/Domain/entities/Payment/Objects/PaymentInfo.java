package com.github.egotting.BackEnd.Domain.entities.Payment.Objects;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Value;
import com.github.egotting.BackEnd.Domain.entities.Payment.ValueObjects.PaymentMethod;
import com.github.egotting.BackEnd.Domain.entities.Payment.ValueObjects.StatusPayment;

public class PaymentInfo {
    private PaymentMethod payment_method;
    private StatusPayment status_payment;
    private Value total_value;

    public String getPaymentMethod() {
        return payment_method.getValue();
    }
}
