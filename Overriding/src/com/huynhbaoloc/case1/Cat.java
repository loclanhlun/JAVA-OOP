package com.huynhbaoloc.case1;

public class Cat extends Animal{
    @Override
    public void move(){
        System.out.println("The cat moves with 4 legs ");
    }
    @Override
    public void sound(){
        System.out.println("Meo Meo");
    }
}
