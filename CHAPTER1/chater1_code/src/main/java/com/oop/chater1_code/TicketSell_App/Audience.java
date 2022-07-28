package com.oop.chater1_code.TicketSell_App;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@AllArgsConstructor
public class Audience {

    private Bag bag;

    public Long buy(Ticket ticket){ // 1. 극장함수의 동작으로 관객과 office의 값이 변경된다
        // 2. 판매방식의 변경이 일어 날시 극장또한 변경이 일어남 -> 의존성이 강함
        // bag을 office에서 접근하지 못하게 막고 의존성을 bag <-> audience로 한정한다.
        if(bag.hasInvitation()){

            bag.setTicket(ticket);
            return 0L;
        }
        else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
