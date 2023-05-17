package com.cailangrott.cinemax.strategy;

import com.cailangrott.cinemax.entity.Ticket;
import com.cailangrott.cinemax.entity.User;

import java.math.BigDecimal;

public class CamaroteStrategy implements TicketSaleStrategy{
    @Override
    public BigDecimal sell(Ticket ticket, User user) {
        return ticket.getTicketType().getValue();
    }
}
