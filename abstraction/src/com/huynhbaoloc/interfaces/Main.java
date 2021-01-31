package com.huynhbaoloc.interfaces;

public class Main {
    public static void main(String[] args) {
        Student student = new StudentImpl();

        student.insert();
        student.update(2);
        student.delete(2); 
    }
}
