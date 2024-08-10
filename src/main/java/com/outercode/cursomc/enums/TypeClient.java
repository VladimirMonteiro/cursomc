package com.outercode.cursomc.enums;

public enum TypeClient {

    NATURALPERSON(1, "Natural person"),
    LEGALENTITIY(2, "Legal entity");

    private int cod;
    private String description;

    private TypeClient(int cod, String description){
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static TypeClient toEnum(Integer cod){
        if(cod == null){
            return null;
        }

        for(TypeClient client : TypeClient.values()){
            if(cod == client.getCod()){
                return client;
            }
        }

        throw new IllegalArgumentException("Id inválido" + cod);
    }
}
