package com.cailangrott.cinemax.entity;

import com.cailangrott.cinemax.entity.enums.TicketType;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class TicketPurchase {
    private TicketType ticketType;
    private User user;
    private BigDecimal value;
}
