package com.github.egotting.BackEnd.Domain.Payment;

import com.github.egotting.BackEnd.Domain.CValueObjects.Id;
import com.github.egotting.BackEnd.Domain.CValueObjects.Value;
import com.github.egotting.BackEnd.Domain.Payment.ValueObjects.PaymentMethod;
import com.github.egotting.BackEnd.Domain.Payment.ValueObjects.StatusPayment;
import com.github.egotting.BackEnd.Domain.Person.Customer.Customer;

import java.time.LocalDateTime;

public class Payment {
    private Id id;
    private Customer cpf_payed;
    private LocalDateTime date_payment;
    private PaymentMethod payment_method;
    private StatusPayment status_payment;
    private Value total_value;
}
