package com.cailangrott.cinemax.strategy;

import com.cailangrott.cinemax.entity.Ticket;
import com.cailangrott.cinemax.entity.User;
import com.cailangrott.cinemax.entity.enums.TicketType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CadeiraSuperiorStrategy implements TicketSaleStrategy{
    private static final BigDecimal ticketOffStudent = BigDecimal.valueOf(0.5);
    private static final BigDecimal ticketOffOlderAge = BigDecimal.valueOf(0.6);
    private static final long olderAge = 60;

    @Override
    public BigDecimal sell(Ticket ticket, User user) {
        long age = ChronoUnit.YEARS.between(user.getBirthDate(), LocalDate.now());
        BigDecimal value = ticket.getTicketType().getValue();

        if (user.getIsStudent()) {
            if (age >= olderAge) {
                return value.subtract(value.multiply(ticketOffOlderAge));
            }
            return value.subtract(value.multiply(ticketOffStudent));
        }
        if (age >= olderAge) {
            return value.subtract(value.multiply(ticketOffOlderAge));
        } else {
            return ticket.getTicketType().getValue();
        }
    }
}
