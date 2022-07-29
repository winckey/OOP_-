package com.oop.chater2_code.Movie_App.step01.pricing;


import com.oop.chater2_code.Movie_App.money.Money;
import com.oop.chater2_code.Movie_App.step01.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
