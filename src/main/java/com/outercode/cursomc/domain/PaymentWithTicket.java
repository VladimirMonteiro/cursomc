package com.outercode.cursomc.domain;

import com.outercode.cursomc.enums.StatePayment;
import jakarta.persistence.Entity;

import java.util.Date;
import java.util.Objects;

@Entity
public class PaymentWithTicket extends Payment {
    private static final long serialVersionUID = 1L;

    private Date dueDate;
    private Date paymentDate;

    public PaymentWithTicket() {
    }

    public PaymentWithTicket(Integer id, StatePayment state, Order order, Date dueDate, Date paymentDate) {
        super(id, state, order);
        this.dueDate = dueDate;
        this.paymentDate = paymentDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }


}
