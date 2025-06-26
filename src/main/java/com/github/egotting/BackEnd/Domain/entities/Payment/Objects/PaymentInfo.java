package com.github.egotting.BackEnd.Domain.entities.Payment.Objects;

import com.github.egotting.BackEnd.Domain.entities.Payment.ValueObjects.PaymentMethod;
import com.github.egotting.BackEnd.Domain.entities.Payment.ValueObjects.StatusPayment;

import java.math.BigDecimal;

public class PaymentInfo {
    private PaymentMethod payment_method;
    private StatusPayment status_payment;
    private BigDecimal value_user_gave;

    public String getPaymentMethod() {
        return payment_method.getValue();
    }
}
