package com.oop.market2;

public class Order {

    private int itemId;

    private int quantity;

    private Payment payment;


    public Order(int itemId, int quantity, Payment payment) {
        this.itemId = itemId;
        this.quantity = quantity;
        this.payment = payment;
    }

    public int getItemId() {
        return itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public Payment getPayment() {
        return payment;
    }
}



