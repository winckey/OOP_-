package com.oop.market2;

import com.oop.market2.condition.DiscountCondition;
import com.oop.market2.condition.NoneCondition;
import lombok.Getter;

@Getter
public class IceCream extends Item implements Meltable{

    public IceCream(int id, int quantity, int price, String name, DiscountCondition discountCondition) {
        super(id, quantity, price, name, discountCondition);
    }

    @Override
    public void isSafety() {
        System.out.println("냉온 보관 하세요");
    }
}



