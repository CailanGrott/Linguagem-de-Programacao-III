package com.cailangrott.cinemax.entity.enums;

import com.cailangrott.cinemax.strategy.*;

import java.math.BigDecimal;

public enum TicketType {
    PISTA(new BigDecimal(250), new PistaStrategy()),
    PISTA_PREMIUM(new BigDecimal(400), new PistaPremiumStrategy()),
    CAMAROTE(new BigDecimal(750), new CamaroteStrategy()),
    CADEIRA_INFERIOR(new BigDecimal(200), new CadeiraInferiorStrategy()),
    CADEIRA_SUPERIOR(new BigDecimal(150), new CadeiraSuperiorStrategy());

    private final TicketSaleStrategy strategy;
    private final BigDecimal valor;

    private TicketType(BigDecimal valor, TicketSaleStrategy strategy) {
        this.valor = valor;
        this.strategy = strategy;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public TicketSaleStrategy getStrategy() {
        return strategy;
    }
}
