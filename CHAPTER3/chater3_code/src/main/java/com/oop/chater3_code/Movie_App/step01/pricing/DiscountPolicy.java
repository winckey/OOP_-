package com.oop.chater3_code.Movie_App.step01.pricing;



import com.oop.chater3_code.Movie_App.money.Money;
import com.oop.chater3_code.Movie_App.step01.Screening;
import com.oop.chater3_code.Movie_App.step01.condition.DiscountCondition;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public abstract class DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening Screening);
}
