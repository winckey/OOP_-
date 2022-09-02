package com.oop.market2.condition;


import com.oop.market2.Order;
import com.oop.market2.Payment;

public class CardCondition implements DiscountCondition {

    private String name;
    private Payment payment;
    private int rate;

    public CardCondition(String name, Payment payment, int rate) {
        this.name = name;
        this.payment = payment;
        this.rate = rate;
    }

    @Override
    public int calculateFee(Order order , int price) {

        if(order.getPayment().getName() == payment.getName())
        {
            return (int) (price-(price*rate/100));
        }
        return price;
    }

    @Override
    public String toString() {
        return "CardCondition{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
}
