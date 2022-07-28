package com.oop.chater1_code.TicketSell_App;


import lombok.Getter;

//@Getter 변경이 어려운 원인 다른곳에서 office에 접근하지 못하도록 한다.
public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }
    public void sellTo(Audience audience){ // 1. 극장함수의 동작으로 관객과 office의 값이 변경된다
        // 2. 판매방식의 변경이 일어 날시 극장또한 변경이 일어남 -> 의존성이 강함
        // enter -> seller 로 옮김으로 theater가 office의 존재를 알수 없음
            ticketOffice.addAmount(   audience.buy(ticketOffice.getTicket()));
    }


//    public void sellTo(Audience audience){ // 1. 극장함수의 동작으로 관객과 office의 값이 변경된다
//        // 2. 판매방식의 변경이 일어 날시 극장또한 변경이 일어남 -> 의존성이 강함
//        // enter -> seller 로 옮김으로 theater가 office의 존재를 알수 없음
//        if(audience.getBag().hasInvitation()){
//            Ticket ticket = ticketOffice.getTicket();
//            audience.getBag().setTicket(ticket);
//        }
//        else {
//            Ticket ticket = ticketOffice.getTicket();
//            audience.getBag().minusAmount(ticket.getFee());
//            ticketOffice.addAmount(ticket.getFee());
//            audience.getBag().setTicket(ticket);
//        }
//    }
}