package com.oop.chater3_code.Movie_App.step01;


import com.oop.chater3_code.Movie_App.money.Money;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }


    public LocalDateTime getStartTime() {// 이부분도 바뀐다?? 그건 잘모르겠다.PeriodCondition 27줄
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount),
                audienceCount);
    }

    Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
