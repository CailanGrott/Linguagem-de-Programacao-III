package com.cailangrott.cinemax.entity.enums;

import com.cailangrott.cinemax.strategy.*;

import java.math.BigDecimal;

public enum TicketType {
    PISTA("Pista" ,new BigDecimal(250), new PistaStrategy()),
    PISTA_PREMIUM("Pista Premium" ,new BigDecimal(400), new PistaPremiumStrategy()),
    CAMAROTE("Camarote" ,new BigDecimal(750), new CamaroteStrategy()),
    CADEIRA_INFERIOR("Cadeira Inferior" ,new BigDecimal(100), new CadeiraInferiorStrategy()),
    CADEIRA_SUPERIOR("Cadeira Superior" ,new BigDecimal(150), new CadeiraSuperiorStrategy());

    private final TicketSaleStrategy strategy;
    private final BigDecimal value;

    private final String name;

    private TicketType(String name,BigDecimal value, TicketSaleStrategy strategy) {
        this.name = name;
        this.value = value;
        this.strategy = strategy;
    }

    public String getName(){
        return name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public TicketSaleStrategy getStrategy() {
        return strategy;
    }
}
