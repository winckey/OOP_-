package com.oop.chater2_code.Movie_App.step01.pricing;


import com.oop.chater2_code.Movie_App.money.Money;
import com.oop.chater2_code.Movie_App.step01.Screening;
import com.oop.chater2_code.Movie_App.step01.condition.DiscountCondition;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
