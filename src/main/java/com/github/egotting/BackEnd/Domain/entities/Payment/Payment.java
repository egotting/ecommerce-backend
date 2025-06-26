package com.github.egotting.BackEnd.Domain.entities.Payment;

import com.github.egotting.BackEnd.Domain.entities.Payment.Objects.IdentifyPayment;
import com.github.egotting.BackEnd.Domain.entities.Payment.Objects.PaymentInfo;

import java.time.LocalDateTime;

public class Payment {
    public Payment(IdentifyPayment identifyPayment, PaymentInfo paymentInfo) {
        this.identifyPayment = identifyPayment;
        this.paymentInfo = paymentInfo;
        this.date_payment = LocalDateTime.now();
    }

    private IdentifyPayment identifyPayment;
    private PaymentInfo paymentInfo;
    private LocalDateTime date_payment;
}
