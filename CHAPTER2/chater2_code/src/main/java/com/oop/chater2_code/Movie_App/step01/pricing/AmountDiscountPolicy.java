package com.oop.chater2_code.Movie_App.step01.pricing;


import com.oop.chater2_code.Movie_App.money.Money;
import com.oop.chater2_code.Movie_App.step01.Screening;
import com.oop.chater2_code.Movie_App.step01.condition.DiscountCondition;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
