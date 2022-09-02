package com.oop.market2.condition;


import com.oop.market2.Order;

public class NoneCondition implements DiscountCondition {

    private String name = "none";
    private int rate;

    @Override
    public int calculateFee(Order order , int price) {
        return price;
    }

    @Override
    public String toString() {
        return "NoneCondition{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
}
