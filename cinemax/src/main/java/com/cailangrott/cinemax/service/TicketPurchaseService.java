package com.cailangrott.cinemax.service;

import com.cailangrott.cinemax.entity.Ticket;
import com.cailangrott.cinemax.entity.User;

import java.math.BigDecimal;

public class TicketPurchaseService {
    public Ticket makePurchase(Ticket ticket, User user) {
        BigDecimal value = ticket.getTicketType().getStrategy().sell(ticket, user);

        ticket = Ticket.builder()
                .title(ticket.getTitle())
                .ticketType(ticket.getTicketType())
                .user(user)
                .value(value)
                .build();

        System.out.println(ticket.getTitle() + "    " + ticket.getTicketType().getName());
        System.out.println("R$ " +ticket.getValue() + "    " + user.getName());
        System.out.println("Promoção: ");
        System.out.println("Estudante? " + user.getIsStudent());
        System.out.println("Idoso? (Mais de 60) " + user.getBirthDate());

        return ticket;
    }
}
