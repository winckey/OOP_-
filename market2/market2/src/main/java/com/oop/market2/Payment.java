package com.oop.market2;

import lombok.Getter;
import lombok.Setter;


public class Payment {// <<--- 인터페이스나 상속하는것이 좋을듯 카카오페이/ 휴대폰결제 등등

    private String name;


    public Payment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public boolean find(Payment name) {
        name.getName();
        return true;
    }
}
