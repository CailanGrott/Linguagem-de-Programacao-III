package com.cailangrott.cinemax.strategy;

import com.cailangrott.cinemax.entity.Ticket;
import com.cailangrott.cinemax.entity.User;
import com.cailangrott.cinemax.entity.enums.TicketType;

import java.math.BigDecimal;

public interface TicketSaleStrategy {
    BigDecimal sell(Ticket ticket, User user);
}
