package com.oop.chater3_code.Movie_App.step01;

import com.oop.chater3_code.Movie_App.money.Money;

public class Reservation {
    private Customer customer;
    private Screening Screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening Screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.Screening = Screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer +
                ", Screening=" + Screening +
                ", fee=" + fee.getAmount() +
                ", audienceCount=" + audienceCount +
                '}';
    }
}
