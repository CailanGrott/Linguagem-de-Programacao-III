package com.cailangrott.cinemax.strategy;

import com.cailangrott.cinemax.entity.User;
import com.cailangrott.cinemax.entity.enums.TicketType;

import java.math.BigDecimal;

public class CamaroteStrategy implements TicketSaleStrategy{
    @Override
    public BigDecimal sell(TicketType ticketType, User user) {
        return ticketType.getValor();
    }
}
