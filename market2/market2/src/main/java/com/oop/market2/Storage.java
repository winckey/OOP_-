package com.oop.market2;


import java.util.ArrayList;

public class Storage {

    private ArrayList<Item> itemArrayList = new ArrayList<>();


    public int purchase(Order order) {
        itemArrayList.get(order.getItemId()).minus(order);

        return itemArrayList.get(order.getItemId()).calcFee(order);
    }


    public void printItemList() {
        for (Item item : itemArrayList) {
            System.out.println(item);
        }
    }


    public void printItemToNum(int id) {
        System.out.println(itemArrayList.get(id));
    }

    public void add(Item item) {
        itemArrayList.add(item);
    }
}



