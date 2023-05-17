package com.cailangrott.cinemax;

import com.cailangrott.cinemax.entity.TicketPurchase;
import com.cailangrott.cinemax.entity.User;
import com.cailangrott.cinemax.entity.enums.TicketType;

import java.time.LocalDate;

public class CinemaxApplication {
    public static void main(String[] args) {
        User user = User.builder()
                .name("Cailan")
                .birthDate(LocalDate.of(1950, 8, 28))
                .build();

        TicketPurchase ticketPurchase = TicketPurchase.builder()
                .ticketType(TicketType.CADEIRA_INFERIOR)
                .user(user)
                .build();

        System.out.println(ticketPurchase);
    }
}
