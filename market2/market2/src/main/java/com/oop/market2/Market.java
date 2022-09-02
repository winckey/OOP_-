package com.oop.market2;



public class Market{


    private Storage storage;

    public void purchase(Order order){

        storage.purchase(order);



    }

    public void search(int id){
        storage.printItemToNum(id);
    }
    public void searchList(){
        storage.printItemList();
    }

}



