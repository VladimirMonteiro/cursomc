package com.outercode.cursomc.enums;

public enum StatePayment {

    PENDING(1, "Pending"),
    PAID(2, "Paid"),
    CALCELED(3, "Calceled");

    private int code;
    private String description;

    private StatePayment(int code, String description){
        this.code = code;
        this.description = description;

    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static StatePayment toEnum(Integer code){
        if(code == null){
            return null;
        }

        for(StatePayment payment : StatePayment.values()){
            if(code == payment.getCode()){
                return payment;
            }
        }

        throw new IllegalArgumentException("Id inválido" + code);
    }

}
