package com.cailangrott.cinemax.entity;

import com.cailangrott.cinemax.entity.enums.TicketType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class Ticket {
    private TicketType ticketType;
    private String title;
    private User user;
    private BigDecimal value;
}
