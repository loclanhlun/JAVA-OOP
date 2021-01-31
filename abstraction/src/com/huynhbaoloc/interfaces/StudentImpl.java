package com.huynhbaoloc.interfaces;

public class StudentImpl implements Student{
    @Override
    public void insert() {
        System.out.println("insert method");
    }

    @Override
    public void update(int id) {
        System.out.println("update method" + id);
    }

    @Override
    public void delete(int id) {
        System.out.println("delete method" + id);
    }
}
