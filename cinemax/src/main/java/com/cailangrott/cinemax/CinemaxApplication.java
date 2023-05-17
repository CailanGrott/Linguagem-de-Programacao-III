package com.cailangrott.cinemax;

import com.cailangrott.cinemax.entity.Ticket;
import com.cailangrott.cinemax.entity.User;
import com.cailangrott.cinemax.entity.enums.TicketType;
import com.cailangrott.cinemax.service.TicketPurchaseService;

import java.time.LocalDate;

public class CinemaxApplication {
    public static void main(String[] args) {
        User user = User.builder()
                .name("Cailan")
                .birthDate(LocalDate.of(2002, 8, 28))
                .isStudent(true)
                .build();

        Ticket ticket = Ticket.builder()
                .ticketType(TicketType.CADEIRA_INFERIOR)
                .title("Vingadores")
                .build();

        TicketPurchaseService ticketPurchaseService = new TicketPurchaseService();
        ticketPurchaseService.makePurchase(ticket, user);
    }
}
