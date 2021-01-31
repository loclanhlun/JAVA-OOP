package com.huynhbaoloc.case1;

public class Main {
    public static void main(String[] args) {
        Animal chicken = new Chicken();
        System.out.println("---Chicken---");
        chicken.move();
        chicken.sound();

        Animal cat = new Cat();
        System.out.println("---Cat---");
        cat.move();
        cat.sound();
    }

}
