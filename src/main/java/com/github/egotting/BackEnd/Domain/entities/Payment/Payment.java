package com.github.egotting.BackEnd.Domain.entities.Payment;

import com.github.egotting.BackEnd.Domain.entities.Payment.Objects.IdentifyPayment;
import com.github.egotting.BackEnd.Domain.entities.Payment.Objects.PaymentInfo;

import java.time.LocalDateTime;

public class Payment {
    public Payment(IdentifyPayment identifyPayment, PaymentInfo paymentInfo, LocalDateTime date_payment) {
        this.identifyPayment = identifyPayment;
        this.paymentInfo = paymentInfo;
        this.date_payment = date_payment;
    }

    private IdentifyPayment identifyPayment;
    private PaymentInfo paymentInfo;
    private LocalDateTime date_payment;
}
