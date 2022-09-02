package com.oop.market2;

import com.oop.market2.condition.DiscountCondition;
import lombok.Getter;

@Getter
public class Snack extends Item{


    public Snack(int id, int quantity, int price, String name, DiscountCondition discountCondition) {
        super(id, quantity, price, name, discountCondition);
    }
}



