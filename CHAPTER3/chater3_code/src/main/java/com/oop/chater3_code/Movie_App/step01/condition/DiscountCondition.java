package com.oop.chater3_code.Movie_App.step01.condition;

import com.oop.chater3_code.Movie_App.step01.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
