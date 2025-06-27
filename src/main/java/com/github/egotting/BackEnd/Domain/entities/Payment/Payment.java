package com.github.egotting.BackEnd.Domain.entities.Payment;

import com.github.egotting.BackEnd.Domain.entities.Payment.Enum.*;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.*;
import com.github.egotting.BackEnd.Domain.entities.ProductsOrders.*;

import java.math.*;
import java.time.*;

public class Payment {
    public Payment() {
    }

    public Payment(
            Long id, EPaymentsMethods payment_method,
            EStatusPayment status_payment) {
        this.id = id;
        this.cpf_payed.getCpf();
        this.payment_method = payment_method;
        this.status_payment = status_payment;
        this.value_should_pay.getTotalPrice();
        this.date_payment = LocalDateTime.now().plusHours(1);
        this.insertedAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    private Long id;
    private Customer cpf_payed;
    private EPaymentsMethods payment_method;
    private EStatusPayment status_payment;
    private ProductsOrders value_should_pay;
    private LocalDateTime date_payment;
    private Instant insertedAt;
    private Instant updatedAt;

    public String getPaymentMethod() {
        return payment_method.name().toUpperCase();
    }

    public String getStatusPayment() {
        return status_payment.name().toUpperCase();
    }

    public BigDecimal getValueShouldPay() {
        return value_should_pay.getTotalPrice();
    }

    public Long getId() {
        return id;
    }

    public Customer getCpf() {
        return cpf_payed;
    }

    public LocalDateTime getDate_payment() {
        return LocalDateTime.now().plusHours(1);
    }

    public Instant getInsertedAt() {
        return Instant.now();
    }

    public Instant getUpdatedAt() {
        return Instant.now();
    }
}
