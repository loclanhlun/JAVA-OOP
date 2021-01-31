package com.huynhbaoloc;

public class Main {
    public static void main(String[] args) {
        Person engineer = new Engineer("Huynh Bao Loc",22, "TP Tuy Hòa", "Lập trình");
        Person student = new Student("Huỳnh Bảo Lộc", 22, "TP Tuy Hòa", "Công nghệ thông tin");

        System.out.println("----------Engineer----------");
        System.out.println("Name: " + engineer.getName());
        System.out.println("Age: " + engineer.getAge());
        System.out.println("Address: " + engineer.getAddress());

        System.out.println("----------Student----------");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());


    }
}
