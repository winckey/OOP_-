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


    public Long hold(Ticket ticket){ // 1. 극장함수의 동작으로 관객과 office의 값이 변경된다
        // 2. 판매방식의 변경이 일어 날시 극장또한 변경이 일어남 -> 의존성이 강함
        // bag을 office에서 접근하지 못하게 막고 의존성을 bag <-> audience로 한정한다.
        if(hasInvitation()){

            setTicket(ticket);
            return 0L;
        }
        else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}