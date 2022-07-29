package com.oop.chater2_code.Movie_App.step01.condition;

import com.oop.chater2_code.Movie_App.step01.Screening;


public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
