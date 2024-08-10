package com.outercode.cursomc.domain;

import com.outercode.cursomc.enums.StatePayment;



public class PaymentWithCard extends Payment{
    private static final long serialVersionUID = 1L;

    private Integer ParcelNumber;

    public PaymentWithCard() {
    }

    public PaymentWithCard(Integer id, StatePayment state, Order order, Integer parcelNumber) {
        super(id, state, order);
        ParcelNumber = parcelNumber;
    }

    public Integer getParcelNumber() {
        return ParcelNumber;
    }

    public void setParcelNumber(Integer parcelNumber) {
        ParcelNumber = parcelNumber;
    }


}
