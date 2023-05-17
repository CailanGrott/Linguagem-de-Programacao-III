package com.cailangrott.cinemax.strategy;

import com.cailangrott.cinemax.entity.User;
import com.cailangrott.cinemax.entity.enums.TicketType;

import java.math.BigDecimal;

public interface TicketSaleStrategy {
    BigDecimal sell(TicketType ticketType, User user);
}
