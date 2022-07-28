package com.oop.chater1_code.TicketSell_App;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bag {




    public long amount;

    public Ticket ticket;

    public Invitation invitation;

    public Bag(long amount){
        this(amount , null);
    }

    public Bag(long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public boolean hasInvitation(){
        return invitation != null;
    }

    public void addAmount(long amount) {
        this.amount += amount;
    }

    public void minusAmount(long amount) {
        this.amount -= amount;
    }
}