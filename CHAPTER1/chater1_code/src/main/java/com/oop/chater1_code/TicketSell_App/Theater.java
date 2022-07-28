package com.oop.chater1_code.TicketSell_App;



public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }


    public void enter(Audience audience){ // 1. 극장함수의 동작으로 관객과 office의 값이 변경된다
                                          // 2. 판매방식의 변경이 일어 날시 극장또한 변경이 일어남 -> 의존성이 강함
        ticketSeller.sellTo(audience);
    }
}