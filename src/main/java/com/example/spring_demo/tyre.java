package com.example.spring_demo;

public class tyre {
    private String Brand;
    public String getBrand(){
        return Brand;
    }
    public void setBrand(String Brand){
        this.Brand=Brand;

    }
    public String toString(){
        return "Tyre [Brand+"+ Brand + "]";
    }
}
