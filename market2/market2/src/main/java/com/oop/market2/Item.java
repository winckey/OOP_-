package com.oop.market2;

import lombok.Getter;

@Getter
public class Item{

    private int id;

    private int quantity;

    private Long price;

    private String name;

    public void minus(Order order) {
        if(this.quantity >= order.getQuantity())
            this.quantity -= quantity;
    }
}



