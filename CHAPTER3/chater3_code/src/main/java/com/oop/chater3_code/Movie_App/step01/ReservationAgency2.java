package com.oop.chater3_code.Movie_App.step01;

import com.oop.chater3_code.Movie_App.money.Money;
import com.oop.chater3_code.Movie_App.step01.condition.DiscountCondition;

public class ReservationAgency2 {

//        boolean discountable = false;
//        for(DiscountCondition condition : movie.getDiscountPolicy().getConditions()) {
//            if (condition.getType() == DiscountConditionType.PERIOD) {
//                discountable = screening.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek()) &&
//                        condition.getStartTime().compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
//                        condition.getEndTime().compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
//            } else {
//                discountable = condition.getSequence() == screening.getSequence();
//            }
//
//            if (discountable) {
//                break;
//            }
//        }
//
//        Money fee;
//        if (discountable) {
//            Money discountAmount = Money.ZERO;
//            switch(movie.getMovieType()) {
//                case AMOUNT_DISCOUNT:
//                    discountAmount = movie.getDiscountAmount();
//                    break;
//                case PERCENT_DISCOUNT:
//                    discountAmount = movie.getFee().times(movie.getDiscountPercent());
//                    break;
//                case NONE_DISCOUNT:
//                    discountAmount = Money.ZERO;
//                    break;
//            }
//
//            fee = movie.getFee().minus(discountAmount).times(audienceCount);
//        } else {
//            fee = movie.getFee().times(audienceCount);
//        }

//        return new Reservation(customer, screening, fee, audienceCount);


}