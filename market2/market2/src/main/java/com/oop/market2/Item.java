package com.oop.market2;

import com.oop.market2.condition.DiscountCondition;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public abstract class Item{

    private int id;

    private int quantity;

    private int price;

    private String name;

    private DiscountCondition discountCondition;

    public Item() {
    }

    public Item(int id, int quantity, int price, String name, DiscountCondition discountCondition) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.discountCondition = discountCondition;
    }

    public void minus(Order order) {
        if(this.quantity >= order.getQuantity())
            this.quantity -= order.getQuantity();
        else {
            // 에러
            System.out.println("err");
        }
    }


    public int calcFee(Order order) {
            return discountCondition.calculateFee(order , price);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", discountCondition=" + discountCondition +
                '}';
    }
}



