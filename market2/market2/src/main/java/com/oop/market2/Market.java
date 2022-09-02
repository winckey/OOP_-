package com.oop.market2;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Market{


    private Storage storage;

    public Market(Storage storage) {
        this.storage = storage;
    }

    public void purchase(Order order){

        System.out.println(storage.purchase(order));

    }

    public void search(int id){
        storage.printItemToNum(id);
    }
    public void searchList(){
        storage.printItemList();
    }

    public void addItem(Item item){
        storage.add(item);
    }

}



