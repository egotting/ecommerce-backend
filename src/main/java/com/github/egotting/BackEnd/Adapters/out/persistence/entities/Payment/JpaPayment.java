package com.github.egotting.BackEnd.Adapters.out.persistence.entities.Payment;

import com.github.egotting.BackEnd.Adapters.out.persistence.entities.Person.Customer.*;
import com.github.egotting.BackEnd.Domain.entities.Payment.*;
import jakarta.persistence.*;
import lombok.*;

import java.math.*;
import java.time.*;

@Entity
@Table(name = "payments")
@Getter
public class JpaPayment {

    @Deprecated
    public JpaPayment() {
    }

    public JpaPayment(Payment domain) {
        this.id = domain.getId();
        this.cpf_payer = new JpaCustomer(domain.getCpf());
        this.payment_method = domain.getPaymentMethod();
        this.status_payment = domain.getStatusPayment();
        this.value_should_pay = domain.getValueShouldPay();
        this.date_payment = domain.getDate_payment();
        this.insertedAt = domain.getInsertedAt();
        this.updatedAt = domain.getUpdatedAt();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @OneToOne
    @JoinColumn(name = "identify_payment_id", nullable = false, unique = true)
    private JpaCustomer cpf_payer;
    @Column(name = "payment_method", nullable = false)
    private String payment_method;
    private String status_payment;
    private BigDecimal value_should_pay;
    private LocalDateTime date_payment;
    private Instant insertedAt;
    private Instant updatedAt;
}
