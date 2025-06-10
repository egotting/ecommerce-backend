package com.github.egotting.BackEnd.Domain.entities.Payment;

import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Identity;
import com.github.egotting.BackEnd.Domain.entities.CValueObjects.Value;
import com.github.egotting.BackEnd.Domain.entities.Payment.ValueObjects.PaymentMethod;
import com.github.egotting.BackEnd.Domain.entities.Payment.ValueObjects.StatusPayment;
import com.github.egotting.BackEnd.Domain.entities.Person.Customer.Customer;

import java.time.LocalDateTime;

public class Payment {
    private Identity id;
    private Customer cpf_payed;
    private LocalDateTime date_payment;
    private PaymentMethod payment_method;
    private StatusPayment status_payment;
    private Value total_value;
}
