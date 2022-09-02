package com.oop.market2.condition;


import com.oop.market2.Order;

public interface DiscountCondition {
    int calculateFee(Order order , int price);
}
