package com.oop.chater1_code.TicketSell_App;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public class TicketOffice {

    public long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(long amount, Ticket ... tickets)
    {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void addAmount(long amount) {
        this.amount += amount;
    }

    public void minusAmount(long amount) {
        this.amount -= amount;
    }
}