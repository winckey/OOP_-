package com.oop.chater1_code.TicketSell_App;


import lombok.Getter;

@Getter
public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }
}