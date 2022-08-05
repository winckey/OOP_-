package com.oop.chater3_code.Movie_App.step01;

import com.oop.chater3_code.Movie_App.money.Money;

public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Money fee = screening.calculateFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);
    }
}
